package org.java.core.base.collection.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Java ArrayList forEach method was added in Java 8. 
 * It��s useful when you want to perform same action on 
 * all the elements. The method argument Consumer is a 
 * functional interface, so we can use lambda expressions too. 
 * <p>
 * ��Java 8�������Java ArrayList forEach�����������������Ԫ��ִ����ͬ�Ĳ���ʱ�����ǳ����á�
 * 
 *  ��������Consumer��һ�����ܽӿڣ��������Ҳ����ʹ��lambda���ʽ
 */
public class ArrayListForEachExample {
	
	public static void main(String[] args) {
			
		List<String> stocks = new ArrayList<>();
		stocks.add("Google"); 
		stocks.add("Apple");
		stocks.add("Microsoft"); 
		stocks.add("Facebook");
		
		Consumer<String> consumer = new ArrayListForEachExample().new MyConsumer();
		stocks.forEach(consumer);
		
		//lambda style
		stocks.forEach(x -> {System.out.println("lambda Processed "+x);});
	}

	class MyConsumer implements Consumer<String>{

		@Override
		public void accept(String t) {
			System.out.println("Processing "+t);
		}
		
	}
}
