package org.java.core.advanced.jvm.classloader;

public class ClassLoaderInfoT {
	
	public static void main(String[] args) {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		System.out.println("��ǰ�������: " + loader);
		System.out.println("��ǰ��ĸ��׼�������������������" + loader.getParent());
		 System.out.println("��ǰ�ุ�׵ĸ��׼��������ޣ���" + loader.getParent().getParent());
	}
	
}
