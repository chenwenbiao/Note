package org.java.core.base.multithreading.ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class WorkerPool {

	public static void main(String args[]) throws InterruptedException {
		// RejectedExecutionHandler implementation
		RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();

		// Get the ThreadFactory implementation to use
		ThreadFactory threadFactory = Executors.defaultThreadFactory();

		// creating the ThreadPoolExecutor
		//�ڳ�ʼ��ThreadPoolExecutorʱ�����ǽ���ʼ�ش�С����Ϊ2�����ش�С����Ϊ4���������д�С����Ϊ2.
		//��ˣ������4���������е��������ύ�˸�������
		//�������н�ֻ�������е�2�� ���ಿ�ֽ���RejectedExecutionHandlerImpl����
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS,
				new ArrayBlockingQueue<Runnable>(2), threadFactory, rejectionHandler);

		// start the monitoring thread
		MyMonitorThread monitor = new MyMonitorThread(threadPoolExecutor, 3);
		Thread monitorThread = new Thread(monitor);
		monitorThread.start();
		
		// submit work to the thread pool
		for (int i = 0; i < 10; i++) {
			threadPoolExecutor.execute(new WorkerThread("cmd" + i));
		}
		
		Thread.sleep(30000);
		// shut down the pool
		//��������رգ�����ִ����ǰ�ύ�����񣬵���������κ�������
		//����Ѿ��رգ��򲻻���������Ӱ��
		//�˷�������ȴ���ǰ�ύ������ִ����ɡ� ����ʹ��awaitTermination��������һ�㡣
		threadPoolExecutor.shutdown();
		// shut down the monitor thread
		Thread.sleep(5000);
		monitor.shutdown();
	}

}
