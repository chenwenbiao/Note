package org.java.core.base.generics;

/**
 * Java���ͺͼ̳�:
 * 
 * ����֪�������A��B�����࣬Java�̳��������ǽ�A��ʵ������ �������һ��������B�ı���.
 *
 * ���ǿ�����Ϊ�κη������͵�A�����Է��������B������ʵ������ˡ�
 * 
 * We are not allowed to assign MyClass<String> variable 
 * to MyClass<Object> variable because they are not related,
 *  in fact MyClass<T> parent is Object.
 *
 */
public class GenericsInheritance {

	public static void main(String[] args) {
		String str = "abc";
		Object obj = new Object();
		obj=str; // works because String is-a Object, inheritance in java
		
		MyClass<String> myClass1 = new MyClass<String>();
		MyClass<Object> myClass2 = new MyClass<Object>();
		
		//myClass2=myClass1; // compilation error since MyClass<String> is not a MyClass<Object>
		obj = myClass1; // MyClass<T> parent is Object
	}
	
	public static class MyClass<T>{}

}
