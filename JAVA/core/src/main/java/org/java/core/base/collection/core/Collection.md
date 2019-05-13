## Collection(集合)

### 概念

>java.util.Collection是集合框架的根接口，位于集合框架顶部

在Collection体系中，存在了Iterator迭代器和Comparable，Comparator对象排序接口

> Collection接口是最基本的集合接口，它不提供直接的实现，而是由子接口来提供实现,
以下是其重要子接口:

* Set是元素无序，不可重复的接口
* List是存储有序可重复的元素接口
* Queue接口

### 集合重要的实现类

* ArrayList(常用)
* LinkedList(线程不安全的)
* HashMap(常用)
* TreeMap(线程不安全的)
* HashSet(常用)
* TreeSet
* Vector(线程安全,因为内部使用了synchronized修饰)

### 存储对象的容器

>除了集合可以存储对象，数组也可以存储对象，但是数组存储对象有如下弊端：

1.数组长度一旦初始化就不可改变，存储对象的个数就不能改变
2.数组中真实存储的对象的个数也没有现成方法可用

### Collection常用方法

1. size();返回集合中元素个数
2. add("AA");向集合中添加元素
3. addAll(List);向集合中添加一个集合中的全部元素
4. isEmpty();判断集合是否为空
5. clear();清空集合元素
6. contains("AA");查看集合中是否包含某一个元素，返回一个布尔类型的值
7. containsAll(list);当前集合是否包含list中的所有元素，只有全部包含才返回true
8. retainAll(list);将当前集合中与形参集合一样的元素保留。(retain是保留的意思。)
9. remove(new Person("DD", 12));删除集合中某一个元素，删除成功返回true，否则false，这里返回false。
10. removeAll(list);移除当前集合中包含形参集合的元素。
11. equals(list);判断当前集合是否与形参集合完全相同.(注意元素顺序不同的时候，返回false,即使元素通过equals是相等的.)
12. toArray();将集合装换为数组。
13. iterator();返回一个Iterator，实现集合遍历，这个iterator方法是public interface Iterable<T> {}接口的一个方法.Collection继承了这个接口.

>注意：从第六个方法开始,都依赖与对象的equals方法。一般而言集合中的对象元素都应该重写equals方法。

### Collection和collections的区别

* Collection是一个接口，他是Set、List等容器的父接口。
* Collections是一个工具类，提供了一系列的静态方法来辅助容器操作，这些方法包括对容器的搜索，排序等