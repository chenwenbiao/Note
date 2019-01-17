Java Queue��java.util���п��õĽӿڣ�����չ��java.util.Collection�ӿڡ�
����Java Listһ����Java Queue������Ԫ�أ�or object���ļ��ϣ������Բ�ͬ��ʽִ�в����ɾ�������� 
(it performs insert and remove operations differently.)�ڴ�����ЩԪ��֮ǰ��
���ǿ���ʹ��Queue�洢Ԫ�ء�

public interface Queue<E> extends Collection<E> {}

public interface Collection<E> extends Iterable<E> {}

public interface Iterable<T> {}

some of the important points about Java Queue:

1. java.util.Queue�ӿ���java.util.Collection�ӿڵ������͡�
2. ������ʵ����(real-world)�Ķ���һ����Queue�ڶ���ĩβ(rear)����(insert)
Ԫ�ز��Ӷ��еĿ�ͷ(front)ɾ��(delete)��   (insert)--rear-----------front--->(remove)
3. Java Queue��ʾԪ�ص������б�(represents an ordered list of elements.)
4. Java Queue��ѭFIFO˳���������ɾ������Ԫ�ء� FIFO���������ȳ���(FIFO stands for First in First Out)
5. Java Queue֧��Collection�ӿڵ����з�����
6. ��õ�Queueʵ����LinkedList��ArrayBlockingQueue��PriorityQueue��
7. BlockingQueues������nullԪ�ء� �������ִ���κ���null��صĲ����������׳�NullPointerException��
8. BlockingQueues����ʵ�ֻ���������/�����ߵ�Ӧ�ó���
9. BlockingQueues���̰߳�ȫ�ġ�
10.  java.util.concurrent package�п��õ�Queues��Bounded Queues.
11. ����Deques�������̰߳�ȫ�ġ�
12. ConcurrentLinkedQueue is an unbounded thread-safe Queue based on linked nodes.
ConcurrentLinkedQueue��һ���޽���̰߳�ȫ�Ļ������ӽڵ��Queue.
13. ����Deques֮�⣬���ж��ж�֧���ڶ���β�����벢�ڶ��е�ͷ��ɾ����
14. Deques�Ƕ��У�������֧�����˵�Ԫ�ز�����Ƴ���(Deques are queues but they support element insertion and removal at both ends.)

Deque:

	 (insert or remove)--rear-----------front--->(remove or insert)

Java Queue�ӿ���չ��Collection�ӿڡ� ���Ͻӿ���չ��Iterable�ӿڡ�
һЩ���õ�Queueʵ������LinkedList��PriorityQueue��ArrayBlockingQueue��
DelayQueue��LinkedBlockingQueue��PriorityBlockingQueue��.
AbstractQueue�ṩ��Queue�ӿڵĹǸ�ʵ�֣��Լ���ʵ��Queue�Ĺ�������

some of the useful and frequently used Java Queue methods:

int size��������ȡSet�е�Ԫ������
boolean isEmpty���������Set�Ƿ�Ϊ�ա�
boolean contains��Object o���������Set����ָ����Ԫ�أ��򷵻�true��
Iterator iterator���������ش�set��Ԫ�صĵ�������Ԫ�ذ��ض�˳�򷵻ء�
boolean removeAll��Collection c�����Ӵ�set���Ƴ�ָ��collection�а���������Ԫ�أ���ѡ��������
boolean retainAll��Collection c������������set�а�����ָ��collection�е�Ԫ�أ���ѡ��������
void clear�������Ӽ�����ɾ������Ԫ�ء�
E remove������������ɾ���˶��е�ͷ����
E poll������������ɾ���˶��е�ͷ��������˶���Ϊ�գ��򷵻�null��
E peek��������������ɾ���˶��е�ͷ��������˶���Ϊ�գ��򷵻�null��
boolean offer��E e������������ڲ�Υ���������Ƶ����������ִ�д˲�������ָ����Ԫ�ز���˶��С�
E element��������������ɾ���˶��е�ͷ����
boolean add��E e������������ڲ�Υ���������Ƶ����������ִ�д˲�������ָ����Ԫ�ز���˶����У��ɹ�ʱ����true�������ǰû�п��ÿռ����׳�IllegalStateException��
Object [] toArray���������ذ�����set������Ԫ�ص����顣�����set������������ص�Ԫ�ص�˳�������κα�֤����˷�����������ͬ��˳�򷵻�Ԫ�ء�

Java Queue Common Operations

	Java Queue supports all operations supported by Collection interface 
	and some more operations. It supports almost all operations in two forms.

1. One set of operations throws an exception if the operation fails.
�������ʧ�ܣ���һ������������쳣��
2. The other set of operations returns a special value if the operation fails.
�������ʧ�ܣ�����һ�������������ֵ��

The following table explains all Queue common operations briefly:

OPERATION	THROWS EXCEPTION		SPECIAL VALUE
Insert			add(e)					offer(e)
Remove			remove()				poll()
Examine			element()				peek()

Java Queue Categories(Java Queue�ķ���)

��Java�У����ǿ����ҵ����Queueʵ�֡� ���ǿ��Խ����Ǵ��·�Ϊ��������:
In Java,we can find many Queue implementations. we can broadly categorize them
into the following two types.

Bounded Queues �н����
Unbounded Queues �޽����

1. �н���������������ƵĶ��У�����ζ��������Ҫ�ڴ���ʱ�ṩ���е�����С�� 
����ArrayBlockingQueue.
2. �޽�����ǲ����������ƵĶ��У�����ζ�����ǲ�Ӧ���ṩ���еĴ�С�� ����LinkedList

All Queues which are available in java.util package are Unbounded Queues 
and Queues which are available in java.util.concurrent package are Bounded Queues.

���������棬we���Խ����Ǵ��·�Ϊ�����������ͣ�

��ֹ����(Blocking Queues)
����������(Non-Blocking Queues)

ʵ��BlockingQueue�ӿڵ����ж��ж���BlockingQueues�������Ƿ��������С�

BlockingQueues����ֱ����������Ĺ�����ʱ����Non-BlockingQueues���ᡣ

��Щ������Deques����Щ������PriorityQueues��

BlockingQueue Operations:

����Queue�����ֲ�����ʽ֮�⣬BlockingQueue��֧������������ʽ��������ʾ��
In addition to Queue��s two forms of operations, BlockingQueue��s 
supports two more forms as shown below.


OPERATION	THROWS EXCEPTION	SPECIAL VALUE	BLOCKS	TIMES OUT
Insert		add(e)				offer(e)		put(e)	offer(e, time, unit)
Remove		remove()			poll()			take()	poll(time, unit)
Examine		element()			peek()			N/A	N/A

ĳЩ��������ֹ��ֱ����������Ĺ�����other������������ֱ����ʱ��


