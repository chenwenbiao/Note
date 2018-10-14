Java�е�Comparable��Comparator���ڶ��󼯺ϵ�����ǳ����á�

Comparable(�ɱȽϵ�)��

Java�ṩ��һЩ���÷������� �����������飨primitive types array��
�� ��װ��������(Wrapper classes array)�� �б�(list) ��������

 ��������ǽ�����ѧϰ��ζ� �������ͺͰ�װ����  �� (���� or �б�) ��������
 Ȼ�����ǽ�ʹ��java.lang.Comparable��
java.util.Comparator�ӿڶ� �Զ������ (���� or �б�)��������

 ������������κ� �Զ����� ��ʹ��Arrays or Collections�����򷽷���
 ��ô���ǵ��Զ������Ҫʵ��Comparable�ӿڡ�
 
Comparable�ӿھ���compareTo(T o)�������÷��������򷽷�ʹ�ã�
�����Լ���κ�Wrapper��String��Date����ȷ����һ�㡣

����Ӧ���������ķ�ʽ���Ǵ˷�����
	�����this������С�ڣ����ڻ������Ϊ�������ݵĶ����򷵻ظ������������������

//����������Employees���鰴id����������, ascending order.

But, in most real life scenarios, we want sorting based 
on different parameters.
���ǣ��ڴ������ʵ������У�����ϣ�����ڲ�ͬ�Ĳ����������� 
���磬��Ϊ��ϯִ�й٣��������н�ʶ�Ա�����з��࣬������Դ����ϣ��������������ǽ��з��ࡣ

��ʱ������Ҫʹ�� Java Comparator�ӿڵ����Σ�
��ΪComparable.compareTo��Object o������ʵ��ֻ�ܻ���һ���ֶν�������
�����޷�ѡ��Ҫ�������������ֶΡ� 

Comparator(�Ƚ���):

Comparator�ӿڵ�compare(Object o1, Object o2) ������Ҫ��ʵ�֣�
�˷�������2��Object��������Ӧ���������ķ�ʽʵ�֣�

�����һ������С�ڵڶ����������򷵻ظ�int��
�����������򷵻��� �����һ���������ڵڶ�����������Ϊ��int��

Comparable��Comparator�ӿ�ʹ��Generics���б���ʱ���ͼ�顣

������������֪�����������Ҫ��java����������б��������
������Ҫʵ��java Comparable�ӿ����ṩĬ������
����Ӧ��ʵ��java Comparator�ӿ����ṩ��ͬ������ʽ��

���ǻ����Դ���ʵ��Comparator�ӿڵĵ����࣬Ȼ��ʹ����

java.lang.Comparable��java.util.Comparator
��ǿ��Ľӿڣ���������java���ṩ�������

Comparable vs(versus) Comparator:

1. Comparable interface�����ṩ��һ������ʽ,
��Comparator�ӿ������ṩ��ͬ������ʽ��

2. ����ʹ��Comparable��Class��Ҫʵ������������ʹ��Comparator��
���ǲ���Ҫ�����н����κθ��ġ�

3. Comparable�ӿ���java.lang���У���Comparator�ӿ���java.util���С�

4. ���ǲ���Ҫ�ڿͻ��˽����κδ��������ʹ��Comparable��
Arrays.sort������Collection.sort���������Զ�ʹ�����compareTo����������
������Comparator���ͻ�����Ҫ�ṩComparator������compare����������ʹ�á�

5. ����Comparator������Collections.sort����������ѭ����ģʽ