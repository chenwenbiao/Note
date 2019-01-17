��Java 5�������˷��ͣ��Ա���ʹ��Collection��ʱɾ��type-casting�����ڱ���ʱ�ṩ���ͼ��ķ���
(type checking at compile time.)��
 ���ǿ���ʹ�÷����������������ͽӿں��࣬����Ҳ���Խ����뷽��һ��ʹ�á�

Java Genrics��Java 5�����������Ҫ�Ĺ���֮һ��

��Java 5������˷��ͣ����ṩ����ʱ���ͼ�鲢������ʹ�ü�����ʱ������ClassCastException���ա�
 �������Ͽ�ܱ���дΪʹ�÷�����ȷ�����Ͱ�ȫ�� 
 �����ǿ���������ΰ������ǰ�ȫ��ʹ�ü����ࡣ

�ڴ����б�ʱ��������ָ���б��е�Ԫ������ΪString�� 
��ˣ�������ǳ������б�������κ��������͵Ķ��󣬳����׳�����ʱ����
����ע�⣬��forѭ���У����ǲ���Ҫ���б��ж�Ԫ�ؽ�������ת����
���������ʱɾ����ClassCastException��

���ǿ���ʹ�÷������Ͷ��������Լ����ࡣ �����������������ϲ����������ӿڡ� 
����ʹ�ü����ţ�<>����ָ�����Ͳ�����

����ʹ�÷��Ͷ���һ���࣬�����Զ���ӿڣ�Comparable interface �ǽӿ��з��͵�һ���ܺõ����ӣ����ı�д���£�

//package java.lang;
//import java.util.*;
//
//public interface Comparable<T> {
//    public int compareTo(T o);
//}

����Ҳ�����ж��ֲ�ͬ���͵Ĳ���������Map�ӿ���:
public interface Map<K,V> {}
new HashMap<String, List<String>>();Ҳ����Ч��

Java�������ͣ�

Java������������Լ���������������ɵ������룬���Ҿ�������Լ����Java������Ե����ʵ��֮һ��
��˷���Ҳ���������Լ�������Լ���� ͨ�������Ͳ��������ǵ�����д��ĸ��
�Ա�����java�����������֡� ��õ����Ͳ��������ǣ�

E �C Element (used extensively by the Java Collections Framework, for example ArrayList, Set etc.)
K �C Key (Used in Map)
N �C Number
T �C Type
V �C Value (Used in Map)
S,U,V etc. �C 2nd, 3rd, 4th types

Java���ͷ���
��ʱ���ǲ�ϣ������������в���������������������ǿ��Դ���java���ͷ�����
���ڹ��캯����һ������ķ���������Ҳ�����ڹ��캯����ʹ�÷������͡�


Java Generics Bounded Type Parameters(Java�����н����Ͳ���):
��������Ҫ���ƿ��ڷ����д���Ķ�������ͣ���һ�������бȽ�2����������Ҫȷ�����ܵ�
2��������Caomparables��Ҳ����2�������ǿɱȽϵģ����ʱ���Ҫ�����н�
���Ͳ���:
 Ҫ�����н����Ͳ��������г����Ͳ��������ƣ�
 Ȼ����extends�ؼ��֣���������ޣ�����������ķ���:
 
public static <T extends Comparable<T>> int compare(T t1, T t2){
		return t1.compareTo(t2);
}

��Щ�����ĵ����������޽緽��, ������ǳ���ʹ���κβ��ɱȽϵ��࣬
�����׳�����ʱ����

�н����Ͳ��������뷽���Լ���ͽӿ�һ��ʹ�á�

Java GenericsҲ֧�ֶ���߽磬��<T��չA��B��C>�� 
����������£�A�����ǽӿڻ��ࡣ ���A���࣬��ôB��CӦ���ǽӿڡ�
 ���ǲ����ڶ���߽���ӵ�ж���ࡣ
 
Java Generics supports multiple bounds also, 
i.e <T extends A & B & C>. In this case A can be an interface or class. 
If A is class then B and C should be interfaces. 
We can��t have more than one class in multiple bounds.
 
// ʹ�÷���ͨ������Խ��������ͻ�
//	List<? extends Integer> intList = new ArrayList<>();
//	List<? extends Number>  numList = intList;  
// OK. List<? extends Integer> is a subtype of List<? extends Number>

���Ͳ�֧�������ͣ�List<Number> numbers = new ArrayList<Integer>(); will not compile,
���ǲ��ܴ����������飺List<Integer>[] array = new ArrayList<Integer>[10]

List<Long> listLong = new ArrayList<Long>();
listLong.add(Long.valueOf(10));
List<Number> listNumbers = listLong; // compiler error
listNumbers.add(Double.valueOf(1.23));

������������Ĵ����п��Կ������������֧�������ͣ����ǿ������ɵؽ�Double��ӵ�Long�б��У�
����ڱ���Long�б�ʱ������ʱ����ClassCastException��
