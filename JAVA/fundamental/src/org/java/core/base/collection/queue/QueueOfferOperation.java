package org.java.core.base.collection.queue;

import java.util.concurrent.*;

// Queue offer() operation
// offer�����������ڽ���Ԫ�ز�����С� ������ɹ�ִ�в���������򷵻ء�true��ֵ�� ���򷵻ء�false��ֵ��
public class QueueOfferOperation {
	public static void main(String[] args) {
		// �������ǵĶ��н���������Ԫ�أ������ǳ���ʹ��BlockingQueue.offer����������ӵ�����Ԫ��ʱ�������ء�false��ֵ
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

		System.out.println(queue.offer("one"));
		System.out.println(queue.offer("two"));
		System.out.println(queue);
		System.out.println(queue.offer("three"));
		System.out.println(queue);
	}
}
