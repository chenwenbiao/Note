package org.java.core.advanced.SystemClass;

import java.util.Arrays;

public class JavaSystemArrayCopy {
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {10,11,12,13,14};
		
		//Java System class provides a native method for 
		//copying data from one array to another. This is a native 
		//implementation and supposed to be faster than other ways to copy array data.
		//Java System���ṩ��һ�ֽ����ݴ�һ�����鸴�Ƶ���һ�������native method,����һ��nativeʵ�֣�
		//��������������
		
		//copying first two elements from array1 to array2 starting from index 2 of array2
		System.arraycopy(arr1, 0, arr2, 2, 2);
		
		System.out.println(Arrays.toString(arr2));
	}
}
