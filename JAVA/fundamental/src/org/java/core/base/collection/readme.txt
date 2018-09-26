Java Collections Framework consists of following parts:(Java���Ͽ�ܰ�����������)

Interfaces: Java Collections Framework interfaces provides the abstract data 
type to represent collection. java.util.Collection is the root interface of 
Collections Framework. It is on the top of Collections framework hierarchy. 
It contains some important methods such as size(), iterator(), add(), remove(), clear() 
that every Collection class must implement. Some other important interfaces are 
java.util.List, java.util.Set, java.util.Queue and java.util.Map. Map is the only 
interface that doesn��t inherits from Collection interface but it��s part of Collections 
framework. All the collections framework interfaces are present in java.util package.

�ӿ�: Java���Ͽ���ṩ�˱�ʾ���ϵĳ����������ͣ�java.util.Collection�Ǽ��Ͽ�ܵĸ��ӿڣ���λ��Collections��ܲ�ε�
��������������һЩ��size(),iterator(),add(),remove(),clear()��ÿһ�����������Ҫʵ�ֵ���Ҫ������
һЩ��������Ҫ�ӿ���java.util.List, java.util.Set, java.util.Queue, java.util.Map, Map��Ψһ�Ĳ���
Collection�̳еĽӿڣ���������Collections��ܵ�һ���֣����еļ��Ͽ�ܽӿڶ�������java.util���С�

Implementation Classes: Collections in Java provides core implementation classes for 
collections. We can use them to create different types of collections in java program. 
Some important collection classes are ArrayList, LinkedList, HashMap, TreeMap, HashSet, 
TreeSet.These classes solve most of our programming needs but if we need some special 
collection class, we can extend them to create our custom collection class.

ʵ����: һЩ��Ҫ�ļ�������ArrayList, LinkedList, HashMap, TreeMap, HashSet, TreeSet.
��Щ���������Ǵ󲿷ֵı����Ҫ���������������ҪһЩ���⼯���࣬���ǿ�����չ����ȥ���������Զ���ļ�����

Java 1.5 came up with thread-safe collection classes that allowed to modify Collections 
while iterating over it, some of them are CopyOnWriteArrayList, ConcurrentHashMap, 
CopyOnWriteArraySet. These classes are in java.util.concurrent package. All the collection 
classes are present in java.util and java.util.concurrent package.

Java1.5������̰߳�ȫ�ļ����࣬������������ʱ���޸ļ��ϣ������е�һЩ��CopyOnWriteArrayList, ConcurrentHashMap, 
CopyOnWriteArraySet, ��Щ������java.util.concurrent���أ����е���Щ�����඼������java.util��java.util.concurrent����.

Algorithms: Algorithms are useful methods to provide some common functionalities, 
for example searching, sorting and shuffling.

�㷨���㷨���ṩһЩ���ù��ܵ����÷�������������������ͻ�ϴ��

