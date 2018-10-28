���ǽ������й�Java��ListIterator�����¸���:


Java Iterator�ľ�����(Limitations of Java Iterator)
Java ListIterator
Java ListIterator��ͼ(Class Diagram)
Java ListIterator����
Java ListIterator����ʾ��(Basic Example)
ListIterator˫�����ʾ��(Bi-Directional Iteration Example)
Java������������(Types of Java Iterators)
Java ListIterator������ڲ�������(How Java ListIterator works Internally?)
ListIterator���ŵ�(Advantages of ListIterator)
ListIterator�ľ�����
Iterator��ListIterator֮�������֮��(Similarities between Iterator and ListIterator)
Iterator��ListIterator֮��Ĳ���(Differences between Iterator and ListIterator)

��Iteratorһ����ListIterator��һ��Java Iterator�����ڴ�Listʵ�ֵĶ������������Ԫ�ء�

����Java 1.2��ʼ�ṩ��(It is available since Java 1.2.)
It extends Iterator interface.
������ʵ��List�������á�(It is useful only for List implemented classes.)
��Iterator��ͬ����֧���������ֲ���(Unlike Iterator, It supports all four operations.)��
CRUD��CREATE��READ��UPDATE��DELETE����
��Iterator��ͬ����֧��ǰ��ͺ������������һ��˫���������
Unlike Iterator, It supports both Forward Direction and Backward Direction iterations.
It is a Bi-directional Iterator.
��û�е�ǰԪ��(It has no current element);
���Ĺ��λ������λ�ڵ���previous�������ص�Ԫ�غ͵���next�������ص�Ԫ��֮�䡣

ע�⣺ - Collection API�е�CRUD������ʲô��

CREATE����Collection���������Ԫ�ء�
READ����Collection�����м���Ԫ�ء�
UPDATE�����»�����Collection�����е�����Ԫ�ء�
DELETE����Collection������ɾ��Ԫ�ء�

public interface ListIterator<E> extends Iterator<E> {}
public interface Iterator<E> {}

Ϊ��֧��ǰ��ͺ��������CRUD������To support Forward and Backward Direction 
iteration and CRUD operations���������·��������ǿ��Խ����Iterator
��������Listʵ�ֵ��࣬��ArrayList��CopyOnWriteArrayList��
LinkedList��Stack��Vector��:

void add��E e������ָ����Ԫ�ز����б��С�
boolean hasNext������������б����������ǰ�����б�ʱ���и���Ԫ�أ��򷵻�true��
boolean hasPrevious������������б�������ڷ�������б�ʱ���и���Ԫ�أ��򷵻�true��
E next�����������б��е���һ��Ԫ�ز�ǰ�����λ�á�
int nextIndex���������غ�������next�������ص�Ԫ�ص�������
E previous�����������б��е���һ��Ԫ�ز�����ƶ����λ�á�
int previousIndex���������غ�������previous�������ص�Ԫ�ص�������
void remove���������б���ɾ��next������previous�������ص����һ��Ԫ�ء�
void set��E e������ָ����Ԫ���滻next������previous�������ص����һ��Ԫ�ء�

Java������������
����֪��Java���ĸ��α꣺Enumeration��Iterator��ListIterator��Spliterator�� 
���ǿ��Խ����Ƿ�Ϊ������Ҫ���ͣ�������ʾ��

���������
������Cursors����֧��Forward Direction������ ���磬
Enumeration��Iterator����Uni-Directional Iterators��

˫�������
������֧��ǰ��ͺ���������αꡣ ���磬ListIterator��Bi-Directional Iterators��

Java ListIterator������ڲ�������
������֪��Java ListIterator�����������϶���Ч������ζ������������ǰ�����������Ϲ����� ����һ��˫��������� Ϊ��֧�ִ˹��ܣ��������鷽����

ǰ���������
������Ҫʹ�����·�����֧��ǰ�������

hasNext������
next����
nextIndex����

������������
������Ҫʹ�����·�����֧������������

hasPrevious����
previous����
previousIndex����

��Iterator��ͬ��ListIterator���������ŵ�:

��Iteratorһ������֧��READ��DELETE������
��Ҳ֧��CREATE��UPDATE������
����ζ�ţ���֧��CRUD������CREATE��READ��UPDATE��DELETE������
��֧������ͷ������������ζ������һ��˫��Java�αꡣ
�������Ƽ����á�

��Iterator��ȣ�Java ListIterator������ŵ㡣���ǣ�����Ȼ��������һЩ����:

����IteratorΨһ��Listʵ���ࡣ
��Iterator��ͬ����������������Collection API��
������ͨ��Java�αꡣ
��Spliterator��ȣ�����֧��Ԫ�صĲ��е�����(it does NOT support Parallel iteration of elements.)
��Spliterator��ȣ�����֧�ָ��õ������������������ݡ�
( it does NOT support better performance to iterate large volume of data.)

Iterator��ListIterator֮�������֮��
�ڱ����У����ǽ�����Java�����α�֮��������ԣ�Iterator��ListIterator��

bother��Java 1.2�����롣
���߶������ڵ���Collection��ListԪ�صĵ�������
���߶�֧��READ��DELETE������
���߶�֧�����������
���߶�����Legacy�ӿڡ�

Differences between Iterator and ListIterator

ITERATOR										LISTITERATOR
Introduced in Java 1.2.							Introduced in Java 1.2.
It is an Iterator for whole Collection API.		It is an Iterator for only List implemented classes.
It is an Universal Iterator.					It is NOT an Universal Iterator.
It supports only Forward Direction Iteration.	It supports both Forward and Backward Direction iterations.
It��s a Uni-Directional Iterator.				It��s a Bi-Directional Iterator.
It supports only READ and DELETE operations.	It supports all CRUD operations.
We can get Iterator by using iterator() method.	We can ListIterator object using listIterator() method.