package org.java.core.base.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		String[] vowels = { "a", "e", "i", "o", "u" };

		List<String> vowelsList = Arrays.asList(vowels);// ���ص���һ��ArrayList�����Բ����ڲ�ʵ��
		// List��һ��interface��������ʵ����һ��Listʵ��.
		System.out.println(vowelsList);

		/**
		 * List is backed by array, we can't do structural modification
		 * List��������֧�ֵģ����ǲ������ṹ�޸� Both of the below statements will throw
		 * java.lang.UnsupportedOperationException
		 */
		// vowelsList.remove("e");
		// vowelsList.clear();

		// using for loop to copy elements from array to list, safe for modification of
		// list
		//��õĽ�array���List�ķ���:
		List<String> myList = new ArrayList<String>();
		for (String s : vowels) {
			myList.add(s);
		}
		System.out.println(myList);
		myList.clear();
		System.out.println(myList);
		
		myList.add(null);
		System.out.println(myList);
	}
}
