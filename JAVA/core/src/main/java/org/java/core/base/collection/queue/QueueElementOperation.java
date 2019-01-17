package org.java.core.base.collection.queue;

import java.util.*;

// Java Queue Examine OperationsJava���м�����

//  ����˲����ɹ�ִ�У��򷵻ض��е�headԪ�ض���ɾ������ 
//������֪��Queue֧��������ʽ�ļ�������

//Queue.element������
//�������ʧ�ܣ����׳��쳣��
//
//Queue.peek������
//�������ʧ�ܣ��򷵻�����ֵ��
//
//ע�⣺ - ��������ֵ�����ǡ��١��򡰿ա�
// Note: Here special value may be either "false" or "null"

//Queue element() operation
//element�����������ڴӶ���ͷ������Ԫ�أ�����ɾ������ ������ɹ�ִ�м�������
//�򷵻ض��е�headԪ�ء� �����׳�java.util.NoSuchElementException��


public class QueueElementOperation {
   public static void main(String[] args) {
		
	Queue<String> queue = new LinkedList<>();
	queue.add("one");
		
	System.out.println(queue.element());
	System.out.println(queue);
	queue.clear();
	System.out.println(queue.element());
	// ������ǳ����ڿ�Queue�ϵ���element���������������׳��쳣
   }
}
