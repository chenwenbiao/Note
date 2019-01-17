class LinkedList<E> extends AbstractSequentialList<E>
implements List<E>, Deque<E>, Cloneable, java.io.Serializable

Java LinkedList��List��Deque(˫�����)�ӿڵ�ʵ�֡� ���ǳ��õ�Listʵ����֮һ��
����ֱ�Ӵ�AbstractList��extends�� ��extends��AbstractSequentialList class

LinkedList���ص�:

	����һ�����򼯺ϣ�֧���ظ�Ԫ�ء� ���Բ���˳��洢Ԫ�ء� ��֧�����nullԪ�ء� ��֧�ֻ��������Ĳ�����

some of the important points about Java LinkedList:

1. ���ڲ�������ʹ��˫���������ݽṹʵ�ֵġ�
2. ��֧���ظ�Ԫ�ء�
3. ���Բ���˳��洢��ά������Ԫ�ء�
4. ���ǿ����������������nullԪ�ء�
5. ����ͬ����ζ���������̰߳�ȫ�ġ�
6. ���ǿ���ʹ��Collections.synchronizedList������������һ��ͬ����LinkedList��
7. ��JavaӦ�ó����У����ǿ��Խ�������List����ջ(stack)�����(queue)��
8. ��û��ʵ��RandomAccess�ӿڡ� ��������ֻ�ܰ�˳�����Ԫ�ء� ����֧���������Ԫ�ء�
9. �����ǳ��Դ�LinkedList����Ԫ��ʱ������Ԫ�ؿ��õ�λ��  ��LinkedList�Ŀ�ͷ���β��ʼ ������Ԫ�ء�
10. ���ǿ���ʹ��ListIterator����LinkedListԪ�ء�
11. ��Java SE 8��ʼ�����ǿ��Խ�LinkedListת��ΪStream����֮��Ȼ��
12. Java SE 9����Ӽ�����������������һ��Immutable LinkedList(���ɱ��Immutable)��

Java LinkedList�б���:

���·����̳���List��Collection�ӿڣ�

	int size��������ȡ�б���Ԫ�ص�������
	boolean isEmpty����������б��Ƿ�Ϊ�ա�
	boolean contains��Object o����������б����ָ����Ԫ�أ��򷵻�true��
	Iterator iterator���������ʵ���˳�򷵻ش��б���Ԫ�صĵ�������
	Object [] toArray���������ʵ���˳�򷵻ذ������б�������Ԫ�ص����顣
	boolean add��E e������ָ����Ԫ��׷�ӵ����б��ĩβ��
	boolean remove��Object o�����Ӵ��б���ɾ��ָ��Ԫ�صĵ�һ��ƥ���
	boolean retainAll��Collection c�������������б��а�����ָ�������е�Ԫ�ء�
	void clear���������б���ɾ������Ԫ�ء�
	E get��int index���������б���ָ��λ�õ�Ԫ�ء�
	E set��int index��E element������ָ����Ԫ���滻�б���ָ��λ�õ�Ԫ�ء�
	ListIterator listIterator�����������б���Ԫ�ص��б��������
	List subList��int fromIndex��int toIndex��������ָ��fromIndex��������
	��toIndex����������֮����б��ֵ���ͼ�����ص��б��ɴ��б�֧��
	����˷����б��еķǽṹ���Ľ���ӳ�ڴ��б��У���֮��Ȼ��

���·����ض���LinkedList�࣬���Ǽ̳���Deque�ӿڣ�

	void addFirst��E e�����ڴ��б�Ŀ�ͷ����ָ����Ԫ�ء�
	void addLast��E e�����ڴ��б��ĩβ����ָ����Ԫ�ء�
	E getFirst��������������ɾ�����б�ĵ�һ��Ԫ�ء��˷�����peekFirst�Ĳ�֮ͬ�������ڣ�������б�Ϊ�գ����׳��쳣��
	E getLast��������������ɾ�����б�����һ��Ԫ�ء��˷�����peekLast�Ĳ�֮ͬ�������ڣ�������б�Ϊ�գ����׳��쳣��
	E remvoeFirst�������Ӵ��б���ɾ�������ص�һ��Ԫ�ء�
	E removeLast�������Ӵ��б���ɾ�����������һ��Ԫ�ء�
	boolean offerFirst��E e�����ڴ��б��ǰ�����ָ����Ԫ�ء�
	boolean offerLast��E e�����ڴ��б��ĩβ����ָ����Ԫ�ء�
	E pollFirst������������ɾ�����б�ĵ�һ��Ԫ�أ�������б�Ϊ�գ��򷵻�null��
	E pollLast������������ɾ�����б�����һ��Ԫ�أ�������б�Ϊ�գ��򷵻�null��
	E peekFirst��������������ɾ�����б�ĵ�һ��Ԫ�أ�������б�Ϊ�գ��򷵻�null��
	E peekLast��������������ɾ�����б�����һ��Ԫ�أ�������б�Ϊ�գ��򷵻�null��

LinkedList��ʹ�ó���ѡ��:

	In this section, we will discuss about what is the best and 
	what is the worst case scenarios to use LinkedList in Java applications.
	�ڱ����У����ǽ�������JavaӦ�ó�����ʹ��LinkedList��������������:
	
	When our frequently used operation is adding or removing 
	elements in the middle of the List, LinkedList is the 
	best class to use.

	Why? Because we don��t need to do more shifts to add 
	or remove elements at the middle of the list. 
	�����Ǿ���ʹ�õĲ�������List���м���ӻ�ɾ��Ԫ��ʱ��LinkedList�����ʹ�õ��ࡣ
	Ϊʲô�� ��Ϊ���ǲ���Ҫ�������ת������ӻ�ɾ���б��м��Ԫ�ء�

	When our frequently used operation is retrieving 
	elements from list, then LinkedList is the worst choice.
	
	Why? Because LinkedList supports only sequential 
	access, does NOT support random access. 

ע�⣺- LinkedListʵ��List��Deque��Cloneable��Serializable��
 ����û��ʵ��RandomAccess�ӿڡ�


Java LinkedList���ڲ���ʾ:

����֪�����ڲ�Java LinkedList��ʹ��˫������ʵ�ֵ�,
 ����Java LinkedList������Ԫ�ر�ʾΪ�ڵ�(node)�� ÿ���ڵ�(node)��Ϊ3������:

����ÿ���ڵ������ض�Ŀ��:

	���ڵ㲿������ָ��LinkedList�е���һ���ڵ㣨��Ԫ�أ���
	�Ҳ�ڵ㲿������ָ��LinkedList�е���һ���ڵ㣨��Ԫ�أ���
	���Ľڵ㲿�����ڴ洢ʵ�����ݡ�

��JVM�У�LinkedList���ᰴ����˳��洢����Ԫ�ء� 
����Ԫ�ش洢���κο��ÿռ��У���ʹ�������Ҳ�ڵ㲿���໥���ӣ�

���������Java LinkedList�й�����
ɾ�������Java LinkedList�й�����

Java SE 9 LinkedList
��Java SE 9�У�Oracle Corp�����һЩ���õ�ʵ�÷���������Immutable List��
 �������ͨ��һЩ���õ�ʾ������ѧϰ���ǣ�
 
 ��鿴�ҵ����ӣ�Java SE 9�����ɱ��б�Ĺ�������