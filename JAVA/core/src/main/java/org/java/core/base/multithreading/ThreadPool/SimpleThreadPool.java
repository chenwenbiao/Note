package org.java.core.base.multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SimpleThreadPool {

	public static void main(String[] args) {
		//java.util.concurrent.Executors�ṩjava.util.concurrent.Executor�ӿڵ�ʵ��
		//����java�д����̳߳�
		//Executors��ʹ��ThreadPoolExecutor�ṩExecutorService�ļ�ʵ�֣�Executors�е��ṩ��ʵ�ִ�������:
		
//		public static ExecutorService newFixedThreadPool(int nThreads) {
//	        return new ThreadPoolExecutor(nThreads, nThreads,
//	                                      0L, TimeUnit.MILLISECONDS,
//	                                      new LinkedBlockingQueue<Runnable>());
//	    }
		
		ExecutorService executor = Executors.newFixedThreadPool(5);//�̳߳����̵߳�����
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread("" + i);
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}

	//���Ǵ���5�������̵߳Ĺ̶���С���̳߳�,Ȼ��������˳��ύ10����ҵ����Ϊ�ش�СΪ5��
	//������ʼ����5����ҵ��������ҵ�����ڵȴ�״̬��ֻҪ����һ����ҵ��ɣ�
	//�ȴ������е���һ����ҵ�� �ɹ����߳̽��ղ�ִ�С�
}
