package org.java.core.base.collection.queue;

import java.util.*;

// Queue poll() operation(��ѯ��ͶƱ)

// poll�����������ڴӶ���ͷ��ɾ��Ԫ�ء� ������ɹ�ִ��ɾ���������򷵻ض��е�headԪ�ء� ���򷵻ء�null��ֵ��
// 
public class QueuePollOperation 
{
   public static void main(String[] args) 
   {		
	Queue<String> queue = new LinkedList<>();
	queue.offer("one");
	queue.offer("two");		
	System.out.println(queue);		
	System.out.println(queue.poll());
	System.out.println(queue.poll());		
	System.out.println(queue.poll());		
	// �������ǵĶ���ֻ������Ԫ�أ������ǳ��Ե����ε���poll��������ʱ��������nullֵ��
   }
}
