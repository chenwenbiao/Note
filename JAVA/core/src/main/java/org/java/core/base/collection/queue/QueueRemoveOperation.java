package org.java.core.base.collection.queue;

import java.util.*;

// Java Queue Delete Operations
// ����ɹ�ִ�У�Delete���������ض��е�headԪ��

// ����֪����Queue֧��������ʽ��ɾ��������

// Queue.remove�������������ʧ�ܣ����׳��쳣��
// Queue.poll�������������ʧ�ܣ��򷵻�����ֵ��

// ע�⣺ - ��������ֵ�����ǡ��١��򡰿ա�
// NOTE:- Here special value may be either ��false�� or ��null��

// Queue remove() operation
// remove�����������ڴӶ���ͷ��ɾ��Ԫ�ء� ������ɹ�ִ��ɾ���������򷵻ض��е�headԪ�ء� 
// �����׳�java.util.NoSuchElementException��
public class QueueRemoveOperation 
{
   public static void main(String[] args) 
   {		
	// �������ǵĶ���ֻ������Ԫ�أ������ǳ��Ե����ε���remove��������ʱ�������׳��쳣
	Queue<String> queue = new LinkedList<>();
	queue.offer("one");
	queue.offer("two");		
	System.out.println(queue);		
	System.out.println(queue.remove());
	System.out.println(queue.remove());		
	System.out.println(queue.remove());		
   }
}

// ע�⣺-
// Queue.remove��element�����ڴӶ�����ɾ��ָ����Ԫ�ء� ������ɹ�ִ��ɾ��������
// �򷵻ء�true��ֵ�� ���򷵻ء�false��ֵ��
