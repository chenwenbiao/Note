Java Stack Class Diagram(Stack��ͼ):
	Java Stackֱ����չVector�࣬���ʵ��RandomAccess��List��Collection�Ƚӿڡ�

public class Stack<E> extends Vector<E> {}

public class Vector<E> extends AbstractList<E> 
implements List<E>, RandomAccess, Cloneable, java.io.Serializable{}

public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E> {}

public abstract class AbstractCollection<E> implements Collection<E> {}

public interface Collection<E> extends Iterable<E> {}


Java Stack��һ��legacy��Collection��, it extends Vector class,
ֻ֧���������,֧��LIFO������ȳ�Last in first out��,��Java 1.0������������
Collection API�п��á�

As Vector implements List, Stack class is also a List 
implementation class but does NOT support all operations 
of Vector or List. As Stack supports LIFO, it is also known 
as LIFO Lists.

����Vectorʵ����List������Stack��Ҳ��Listʵ���࣬
����֧��Vector��List�����в����� ����Stack֧��LIFO�������Ҳ��ΪLIFO�б�

�����й�Java�е�Stack�����¸��

Java Stack(��ջ)
Java Stack Class Diagram
Java Stack Methods
Java Stack Basic Example
How Stack��s push() and pop() works Internally?
Java Array to Stack Example
Java List to Stack Example
Java Stack to List Example

Java Stack(��ջ):

Java Stack��LIFO��������չ��Vector�࣬����֧�����������
(supports only five operations). Java Stack��ֻ��һ�����캯��
which is empty or default constructor.
��ˣ������Ǵ���һ��Stackʱ,�������������Ŀ������ζ��Stack is Empty.
So, when we create a Stack, initially it contains no items that means Stack is empty.

Stack�ڲ���һ��ָ�룺TOP����ָ����StackԪ�صĶ��������StackΪ�գ�
��TOPָ��ǰһ��Ԫ��λ�á����Stack��Ϊ�գ���TOPָ�򶥲�Ԫ�ء�

Java Stack��ʹ���������������չVector�ࡣ

boolean empty���������Դ˶�ջ�Ƿ�Ϊ�ա�
E peek�������鿴�˶�ջ�����Ķ��󣬶�������Ӷ�ջ��ɾ����
E pop�������Ƴ��˶�ջ�����Ķ��󣬲����ö�����Ϊ�˺�����ֵ���ء�
E�ƣ�E�������Ŀ�Ƶ��˶�ջ�Ķ�����
int search��Object o�������ض����ڴ˶�ջ�ϵĴ�1��ʼ��λ�á�

How Stack��s push() and pop() operations works Internally?
Stack��push������pop��������������ڲ�������

As we know Stack��s push() and pop() are most frequently 
used Stack operations. The push() operation is used to 
insert an element into a Stack at top. The pop() operation 
is sued to remove a top element from a Stack.
����֪��Stack��push������pop��������õ�Stack������ push�����������ڽ�
Ԫ�ز��뵽������Stack�С� ִ��pop���������ԴӶ�ջ��ɾ������Ԫ�ء�

Stack data structure has one internal property: top to refer 
top element of that stack. If Stack is empty, this top refers 
to the before first element as shown below:

��ջ���ݽṹ��һ���ڲ����ԣ�top�������øö�ջ�Ķ���Ԫ�ء� 
���StackΪ�գ����topָ���Ǵ�ŵ�һ��Ԫ��λ�õ�ǰһ��Ԫ��:

				|		|
				|		|
				|		|
				|		|
				|		|
				|		|
				|		|
				|		|
				|_______|
						<------Top
				Empty Stack

Stack��Push����ʼ����Stack�Ķ���������Ԫ�ء�
Stack��Pop�������Ǵ�Stack����ɾ��һ��Ԫ�ء�



