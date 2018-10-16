package org.java.core.base.collection.linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 我们将探讨如何将Java LinkedList转换为Array。
 *
 */
public class LinkedListToJavaArrayDemo 
{
	public static void main(String[] args) 
	{		
		List<Integer> numbersList = new LinkedList<>();
		numbersList.add(1);
		numbersList.add(2);
		numbersList.add(3);
		numbersList.add(4);
		numbersList.add(5);
		
		Integer[] numbers = new Integer[numbersList.size()];
		numbers = numbersList.toArray(numbers);

		System.out.println(Arrays.toString(numbers));

	}
}
