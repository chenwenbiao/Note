package org.java.core.base.collection.queue;

import java.util.*;

// ����peek��������
// peek�����������ڴӶ��е�ͷ������Ԫ�أ�����ɾ������ 
// ������ɹ�ִ�м��������򷵻ض��е�headԪ�ء� ���򷵻�nullֵ��
public class QueuePeekOperation {
   public static void main(String[] args) {
		
	Queue<String> queue = new LinkedList<>();
	queue.add("one");
		
	System.out.println(queue.peek());
	System.out.println(queue);
	queue.clear();
	System.out.println(queue.peek());
	// ������ǳ����ڿ�Queue�ϵ���peek������������������nullֵ���������׳��쳣
   }
}
