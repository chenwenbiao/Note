## RMI(Remote Method Invocation，远程方法调用)

在Java世界里，有一种技术可以实现“跨虚拟机”的调用，它就是RMI。例如，服务A 在JVM1 中运行，服务B在JVM2中运行，服务A与服务B 可相互进行远程调用，就像调用本地方法一样，这就是 RMI。在分布式系统中，我们使用 RMI 技术可轻松将服务提供者Service Provider与服务消费者Service Consumer进行分离，`充分体现组件之间的弱耦合，系统架构更易于扩展。`

>先从通过一个最简单的 RMI 服务与调用示例，让读者快速掌握 RMI 的使用方法，然后指出 RMI 的局限性，最后对此问题提供了一种简单的解决方案，即使用ZooKeeper轻松解决RMI 调用过程中所涉及的问题。

>示例: Kafka目录下

### RMI服务的局限性

借助 JNDI这个所谓的命名与目录服务，我们成功地发布并调用了 RMI 服务。

实际上，JNDI 就是一个注册表，服务端将服务对象放入到注册表中，客户端从注册表中获取服务对象。在服务端我们发布了 RMI 服务，并在 JNDI 中进行了注册，此时就在服务端创建了一个 Skeleton（骨架），当客户端第一次成功连接 JNDI 并获取远程服务对象后，立马就在本地创建了一个 Stub（存根），远程通信实际上是通过 Skeleton 与 Stub 来完成的，数据是基于 TCP/IP 协议，在“传输层”上发送的。毋庸置疑，理论上 RMI 一定比 WebService 要快，毕竟 WebService 是基于 HTTP 的，而 HTTP 所携带的数据是通过“应用层”来传输的，传输层较应用层更为底层，越底层越快。

既然 RMI 比 WebService 快，使用起来也方便，那么为什么我们有时候还要用 WebService 呢？

其实原因很简单，WebService 可以实现跨语言系统之间的调用，而 RMI 只能实现 Java 系统之间的调用。也就是说，RMI 的跨平台性不如 WebService 好，假如我们的系统都是用 Java 开发的，那么当然首选就是 RMI 服务了。

>貌似 RMI 确实挺优秀的，除了不能跨平台以外，还有那些问题呢？

笔者认为有两点局限性：

1. RMI 使用了 Java 默认的序列化方式，对于性能要求比较高的系统，可能需要使用其它序列化方案来解决（例如：Proto Buffer）。
2. RMI 服务在运行时难免会存在出故障，例如，如果 RMI服务无法连接了，就会导致客户端无法响应的现象。

>在一般的情况下，Java 默认的序列化方式确实已经足以满足我们的要求了，如果性能方面如果不是问题的话，我们需要解决的实际上是第二点，也就是说，让使系统具备 HA（High Availability，高可用性）。

## 使用 ZooKeeper 提供高可用的 RMI 服务

ZooKeeper是Hadoop的一个子项目，用于解决分布式系统之间的数据一致性问题。

要想解决 RMI 服务的高可用性问题，我们需要利用 ZooKeeper 充当一个 服务注册表（Service Registry），让多个服务提供者（Service Provider）形成一个集群，让 服务消费者（Service Consumer）通过服务注册表获取具体的服务访问地址（也就是 RMI 服务地址）去访问具体的服务提供者。如下图![zk-rmi](../pics/zk-rmi.png)

需要注意的是，服务注册表并不是Load Balancer（负载均衡器），提供的不是“反向代理”服务，而是“服务注册”与“心跳检测”功能。

>利用服务注册表来注册 RMI 地址，这个很好理解，那么“心跳检测”又如何理解呢？说白了就是通过"服务中心(服务注册表)"定时向各个"服务提供者"发送一个请求（实际上建立的是一个Socket 长连接），如果长期没有响应，服务中心就认为该服务提供者已经“挂了”，只会从还“活着”的服务提供者中选出一个做为当前的服务提供者。

也许读者会考虑到，服务中心可能会出现单点故障，如果服务注册表都坏掉了，整个系统也就瘫痪了。看来要想实现这个架构，必须保证服务中心也具备高可用性。ZooKeeper正好能够满足我们上面提到的所有需求。

1. 使用 ZooKeeper 的临时性 ZNode 来存放服务提供者的 RMI 地址，一旦与服务提供者的 Session 中断，会自动清除相应的 ZNode。
2. 让服务消费者去监听这些 ZNode，一旦发现 ZNode 的数据（RMI 地址）有变化，就会重新获取一份有效数据的拷贝。
3. ZooKeeper 与生俱来的集群能力（例如：数据同步与领导选举特性），可以确保服务注册表的高可用性。

>示例: Kafka目录下
