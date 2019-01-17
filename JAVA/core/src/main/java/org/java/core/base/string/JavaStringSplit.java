package org.java.core.base.string;

import java.util.Arrays;

/**
 * split()���ڽ��ַ��������ṩ��������ʽ�ָ�Ϊ���飬
 * ��ʱ����Ҫ�ָ�CSV�ļ��������Ի�����еĲ�ͬ��ֵ,������2�����õķ����ָ�:<br><p>
 * 
 * 1. public String[] split(String regex):�����ṩ��������ʽ�ָ�Ϊ����
 * <p>
 * Notice that the trailing empty strings are not included in 
 * the returned string array	ĩβ�Ŀ��ַ����������ڷ��ص��ַ���������.
 *
 * 2. public String[] split(String regex, int limit): 
 * <p>
 * ��ע�⣬����ĵ�һ�ַ���ʵ����ͨ����limit����Ϊ0��ʹ�õڶ��ַ�����
 */
public class JavaStringSplit {
	public static void main(String[] args) {
		String line = "I am a java developer";

		String[] words = line.split(" ");

		String[] twoWords = line.split(" ", 2);
		
		System.out.println("String split with delimiter: " + Arrays.toString(words));
		
		System.out.println("String split into two: " + Arrays.toString(twoWords));

		// split string delimited with special characters
		String wordsWithNumbers = "I|am|a|java|developer";

		String[] numbers = wordsWithNumbers.split("\\|ss");

		System.out.println("String split with special character: " + Arrays.toString(numbers));

		//We can use backslash to use java regular expression 
		//special characters as normal characters, like I have used 
		//pipe (|) special character in above program.
		
		String s = "abcaada";
		System.out.println(Arrays.toString(s.split("a")));
		
		s = "XZJ,New York,USA";
		String[] data = s.split(",", 2);
		System.out.println("Name = "+data[0]); //XZJ
		System.out.println("Address = "+data[1]); //New York,USA
	}
}

//���������ʽ�������ַ������κβ��ֶ���ƥ�䣬��ô�������ֻ��һ��Ԫ�أ������ַ�����

//