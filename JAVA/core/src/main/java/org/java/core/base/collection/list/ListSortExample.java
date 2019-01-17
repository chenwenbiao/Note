package org.java.core.base.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 2������ʽ��һ�����ü��ϵ�sort����һ�����Զ����������
 */
public class ListSortExample {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		Random random = new Random();
		for(int i=0;i<10;i++) ints.add(random.nextInt(1000));
		
		//natural sorting using Collections class	ʹ��Collections�������Ȼ����
		Collections.sort(ints);
		System.out.println("Natural Sorting: " + ints);
		
		//My custom sorting, reverse order
		ints.sort((o1,o2) -> {return (o2 - o1);});
		System.out.println("Reverse Sorting: "+ints);
	}
}
