package org.java.core.base.collection.queue;

import java.util.concurrent.*;

// Java Queue Insert Operations
// Queue Insert�����ɹ�ִ�У��򷵻ء�true��ֵ��

// Queue֧��������ʽ�Ĳ��������
// Queue.add��E�����������ʧ�ܣ����׳��쳣��
// Queue.offer��E�����������ʧ�ܣ��򷵻�����ֵ��

// ע�⣺ - ��������ֵ�����ǡ��١��򡰿ա�
// NOTE: Here special value may be either false or null

// Queue add() operation
// add�����������ڽ���Ԫ�ز�����С� ������ɹ�ִ�в���������򷵻ء�true��ֵ�� 
// �����׳�java.lang.IllegalStateException��
public class QueueAddOperation {
   public static void main(String[] args) {
	
	// �������ǵĶ��н���������Ԫ�أ������ǳ���ʹ��BlockingQueue.add������ӵ�����Ԫ��ʱ�������׳��쳣
	BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

	System.out.println(queue.add("one"));
	System.out.println(queue.add("two"));
	System.out.println(queue);
	System.out.println(queue.add("three"));
	System.out.println(queue);
   }
}
