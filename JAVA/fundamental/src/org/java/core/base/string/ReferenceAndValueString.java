package org.java.core.base.string;

/**
 * String��ֵ���ݺ����ô���
 *
 */
public class ReferenceAndValueString {
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(str.hashCode());
		change(str);
		System.out.println(str);
		System.out.println(str.hashCode());
		
		System.out.println("-----------------------");
		
		StringObject so = new StringObject();
		so.name = "old name";
		System.out.println(so.hashCode());
		change(so);
		System.out.println(so.name);
	}
	
	/**
	 * @param �β�str�ʹ����str��ָ��ͬһ��String����
	 */
	public static void change(String str) {
		System.out.println(str.hashCode());
		str = "def";
		System.out.println(str);
		System.out.println(str.hashCode());
	}
	
	/**
	 * @param �β�so�ʹ����so��ָ��ͬһ��StringObject����
	 */
	public static void change(StringObject so) {
		System.out.println(so.hashCode());
		so = new StringObject();
		so.name = "new name";
		System.out.println(so.hashCode());
	}
}

class StringObject
{
	String name;
}