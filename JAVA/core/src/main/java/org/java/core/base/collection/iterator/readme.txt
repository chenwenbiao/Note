���ǽ�����Javaö�ٵ�һЩ����֪ʶ�Լ�����Java Iterator���������ۡ� 
���ڲ��Ƽ�ʹ��Java Enumeration�ӿڣ���˲����������ǵ�Ӧ�ó�����ʹ������

���ǽ����۹���Java��Iterator�����¸���:

Java Four Cursors
Java Enumeration Limitations
Java Iterator
Java Iterator Class Diagram
Java Iterator Methods
Java Iterator Basic Example
Develop Custom Class Iterator
How Java Iterator Works Internally?
Advantages of Java Iterator
Limitations of Java Iterator
Similarities between Java Enumeration and Iterator
Differences between Java Enumeration and Iterator

Java Four Cursors:

���ȣ����붨��ʲô��Java�αꣿ Java Cursor��һ����������������
����������������Collection��Stream�����Ԫ�ء�

Java֧���������ֲ�ͬ���α�:

	Enumeration(Java 1.0)
	Iterator(Java 1.2)
	ListIterator(Java 1.2)
	Spliterator(Java 1.8)

ÿ��Java�α궼��һЩ�ŵ��ȱ�㡣 ���ǽ�����ƪ���������۹���ö�ٵ�һЩ����֪ʶ��
���ڵ�����������ϸ�ڡ� �ҽ����Ժ������������ListIterator��Spliterator��

Java Enumeration Limitations(Javaö������)

Javaö�ٴ�Java 1.0��ʼ���ã�����������ƣ�������������Ŀ��ʹ�á�

����Java 1.0�ʹ�ͳ�ӿ��������á�
����������Collection Legacy�ࡣ
�������α���ȣ������зǳ��߳��ķ������ƣ�hasMoreElements������nextElement������
��CRUD�����У�����֧��READ��������֧��CREATE��UPDATE��DELETE������
����֧����������������Ϊʲô��Ҳ����ΪUni-Directional Cursor��
���������µĴ�������Ŀ��ʹ������

CRUD����:

CREATE����Collection���������Ԫ�ء�
READ����Collection�����м���Ԫ�ء�
UPDATE�����»�����Collection�����е�����Ԫ�ء�
DELETE����Collection������ɾ��Ԫ�ء�

Ϊ�˿˷�������Щ���⣬Java�Ƴ����µ��α꣺

1. Iterator��ListIterator��(Java 1.2�Ƴ�)
2. ����Java 1.8��������һ�������͵�Cursor��Spliterator��

Java Iterator(Java������)

��Java�У�Iterator��java.util����Collection����п��õĽӿڡ�����һ��Java Cursor�����ڵ���һ�����

����������������϶���Ԫ�ء�
����Java 1.2 Collection Framework��ʼ�ṩ��
������������Collection�ࡣ������Ҳ����ΪUniversal Java Cursor��
��֧��READ��REMOVE������
��Enumeration�ӿ���ȣ�Iterator�������Ƽ����á�

Java Iterator Class Diagram(Java��������ͼ)

Java Iterator Methods:

boolean hasNext��������������и���Ԫ�أ��򷵻�true��
E next���������ص����е���һ��Ԫ�ء�
default void remove�������ӵײ㼯�����Ƴ��˵��������ص����һ��Ԫ�ء�
default void forEachRemaining��Consumer(�����ߣ�ʹ����) action����
��ÿ��ʣ��Ԫ��ִ�и���������ֱ������������Ԫ�ػ���������쳣��

Develop Custom Class Iterator�����Զ����������

����һ���У�����������Collection API���ʵ��iterator����������
�Ա���ʹ�û�ʹ��Enhanced For Loop������µ�������Ԫ�ء�

�ڱ����У����ǽ��������ΪUser-Defined��Custom���ṩ���ƵĹ��ܡ� ����Ӧ�ð�����Щ˵���ṩ�˹��ܣ�

1. �����Զ����ࡣ(Define Custom class.)
2. ���Collection��Ӧ���ṩIterable�ӿڷ�����ʵ�֣�iterator������
3. ������ǽ���Щָ��ʵ�ֵ�Custom�࣬��ô���Ϳ���ʹ��Enhanced For Loop
���ⲿIterator��������������Ԫ�ء�

Java Iterator������ڲ�������

�˽�Java Iterator���䷽��������ڲ�����:

Java Iterator��֧��Forward Direction Iteration�� ������Ҳ����Ϊ�����ꡣ

Java Iterator���ŵ�
��Enumeration�ӿ���ȣ�Java Iterator���������ŵ��ô���

���ǿ��Խ��������κ�Collection�ࡣ
��֧��READ��REMOVE������
����Collection Cursor for Collection API��
�������Ƽ����á�
Java Iterator�ľ�����
���ǣ�Java Iterator�����������ƻ�ȱ�㡣

��CRUD�����У�����֧��CREATE��UPDATE������
����֧�������������Uni-Directional Iterator��
��Spliterator��ȣ�����֧�ֲ��е���Ԫ�أ�����ζ����ֻ֧��˳�������
��Spliterator��ȣ�����֧�ָ��õ������������������ݡ�
Ϊ�˿˷���Щ���ƣ�Java�������������α꣺ListIterator��Spliterator�����ǽ����Ժ�������������������αꡣ

Java Enumeration��Iterator֮�������֮��
�ڱ����У����ǽ���������Java�α�֮�������֮����Java Enumeration��Iterator

���߶���Java�αꡣ
���߶������������Collection����Ԫ�ء�
���߶�֧��READ��Retrieval������
���߶��ǵ���Java�α꣬����ζ�Ž�֧�����������

Java Enumeration��Iterator֮��Ĳ���
�±�������Java Enumeration��Iterator֮�������:

ENUMERATION							ITERATOR
Introduced in Java 1.0				Introduced in Java 1.2
Legacy Interface					Not Legacy Interface
It is used to iterate only  		Legacy Collection classes.	We can use it for any Collection class.
It supports only READ operation.	It supports both READ and DELETE operations.
It��s not Universal Cursor.			Its a Universal Cursor.
Lengthy Method names.				Simple and easy to use method names.