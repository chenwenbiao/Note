package org.java.core.base.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Java����ͨ���
 * 
 * Question mark (?) �Ƿ����е�ͨ�������ʾδ֪���͡�
 * 
 *  ͨ������������������ֶλ�ֲ����������ͣ���ʱҲ���������������͡�
 *  
 *   �����ڵ��÷��ͷ�����ʵ����������ʱ����ʹ��ͨ����� 
 *   �ڽ������Ĳ����У����ǽ��˽��ϱ߽�ͨ������±߽�ͨ�����ͨ�������
 *   ��upper bounded wildcards, lower bounded wildcards, and wildcard capture.��
 * 
 * Java���������н�ͨ���upper bounded wildcards
 *  �����н�ͨ������ڷſ����б������͵����ơ�
 * 
 *  Java�����޽�ͨ��� Unbounded wildcards
 *   ��ʱ����ϣ�����ǵķ��ͷ����������������ͣ�����������¿���ʹ���޽�ͨ����� 
 *  List<?> ��ʹ��List<�� extends Object>Ч����ͬ
 *  
 *  Java Generics����ͨ�����lower bounded Wildcard��
 *  
 */
public class GenericsWildcards {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3); ints.add(5); ints.add(10);
		double sum = sum(ints);
		System.out.println("Sum of ints="+sum);
		
		addIntegers(new ArrayList<Object>());// lower bound wildcard
	}

	/**
	 * ������һ�������н�ͨ����������Ϳ��Դ���List<Integer> or List<Double>�ȵ�.
	 * 
	 * ���ǿ���ʹ��������Number�����з���
	 * @param list
	 * @return
	 */
	public static double sum(List<? extends Number> list){
		//��������list����ӳ�null֮����κζ���,�����ӵĻ��������ڱ���ʱ����.
		//list.add(10); //error
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		return sum;
	}
	
	//�����������н�ͨ����� �������б����ƣ����ǲ��������б�������κ����ݡ�
	public static void printData(List<?> list){
		for (Object obj : list) {
			System.out.print(obj + "::");
		}
	}
	
	// Java Generics Lower bounded Wildcard
	/**
	 * ����ʹ�÷���ͨ�������super�ؼ����Լ��½���ȥʵ��Java�����½�ͨ���
	 *  We use generics wildcard (?) with super keyword 
	 *  and lower bound class to achieve this.
	 * 
	 * ����������£����ǿ��Խ����޻��������͵ĸ�������Ϊ�������ݣ�
	 * java�����������½����������ӵ��б��С�
	 * @param list
	 */
	public static void addIntegers(List<? super Integer> list){
		list.add(new Integer(50));
	}
	
}
