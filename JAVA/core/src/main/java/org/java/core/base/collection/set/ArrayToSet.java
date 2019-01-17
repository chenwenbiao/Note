package org.java.core.base.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ��List��ͬ�����ǲ���ֱ�ӽ�Java Setת��Ϊ���飬��Ϊ������ʹ��Arrayʵ�ֵġ�
 * 
 * �������ǲ���ʹ��Arrays�������array��Ϊset����ͼ�� ���ǿ��Բ�����һ�ַ�����
 * ���ǿ���ʹ��Arrays.asList��������������ת��ΪList��Ȼ��ʹ����������Set��
 * 
 * ͨ��ʹ�����ַ��������ǿ���ͨ�����ַ�ʽ��Java����ת��ΪSet��
 */
public class ArrayToSet {
	public static void main(String[] args) {

		String[] vowels = { "a", "e", "i", "o", "u" };

		Set<String> vowelsSet = new HashSet<String>(Arrays.asList(vowels));
		System.out.println(vowelsSet);

		/**
		 * Unlike List, Set is NOt backed(֧��) by array, so we can do structural modification
		 * without any issues.
		 */
		vowelsSet.remove("e");
		System.out.println(vowelsSet);
		vowelsSet.clear();
		System.out.println(vowelsSet);
	}
}
