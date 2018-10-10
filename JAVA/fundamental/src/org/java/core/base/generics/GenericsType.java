package org.java.core.base.generics;

public class GenericsType<T> {

	private T t;
	
	public T get() {
		return this.t;
	}
	
	public void set(T t1) {
		this.t = t1;
	}
	
	/**
	 * ע����main������ʹ��GenericsType�ࡣ ���ǲ���Ҫ��������ת����
	 * ���ǿ���������ʱɾ��ClassCastException�� ��������ڴ���ʱ���ṩ���ͣ�
	 * �����������ɾ��桰GenericsType��ԭʼ���͡� 
	 * �Է�������GenericsType <T>������Ӧ�ò���������
	 * 
	 *  �����ǲ��ṩ����ʱ�����ͱ�ΪObject�����������String��Integer����
	 *  ������Ӧ��������ͼ���������������Ϊ�ڴ�����ܲ�������ʱ�����ԭʼ����ʱ���ǽ����ò�ʹ������ת����
	 *  
	 *  ��ʾ�����ǿ���ʹ��@SuppressWarnings����rawtypes����ע�������Ʊ���������.
	 * @param args
	 */
	public static void main(String[] args) {
		GenericsType<String> type = new GenericsType<>();
		type.set("xzj");// valie
		
		// �������û�в���������ôĬ�Ͼ���Object���͵�,������������������ʱ�쳣
		GenericsType type1 = new GenericsType(); // raw type
		type1.set("Pankaj"); // valid
		type1.set(10); // valid and autoboxing support
	}
}
