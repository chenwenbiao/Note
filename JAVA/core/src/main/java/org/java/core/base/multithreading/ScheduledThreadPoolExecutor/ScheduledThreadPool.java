package org.java.core.base.multithreading.ScheduledThreadPoolExecutor;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ��ʱ������Ҫ����ִ����������ض��ӳٺ�ִ������ 
 * Java�ṩ��Timer Class��ͨ�������ǿ���ʵ����һ�㣬
 * ����ʱ������Ҫ�����������Ƶ����� ��ˣ��������Timer������ϵͳ�Ŀ�����
 * ���������һ���ƻ�������̳߳ء�
 * <p><br>
 * Javaͨ��ʵ��ScheduledExecutorService�ӿڵ�
 * ScheduledThreadPoolExecutor���ṩԤ�����̳߳�ʵ��.
 * <p><br>
 * ��ע�⣬����schedule��������������ScheduledFuture��ʵ����
 * ���ǿ���ʹ��������ȡ�̵߳��߳�״̬��Ϣ���ӳ�ʱ�䡣
 * <p><br>
 * ʱ����Ǵӳ��е�һ���̵߳Ŀ�ʼ��
 * ����������periodָ��Ϊ1�벢�������߳�����5�룬
 * ��ô��һ���߳̽��ڵ�һ�������߳��������ִ�к�������ʼִ�С�
 */
public class ScheduledThreadPool {

	public static void main(String[] args) throws InterruptedException {
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

		System.out.println("Current Time = " + new Date());
		for (int i = 0; i < 3; i++) {
			Thread.sleep(1000);
			WorkerThread worker = new WorkerThread("do heavy processing");
			// schedule to run after sometime
			scheduledThreadPool.schedule(worker, 5, TimeUnit.SECONDS);
			
			// schedule task to execute at fixed rate
//			scheduledThreadPool.scheduleAtFixedRate(worker, 0, 5, TimeUnit.SECONDS);
			
			//ScheduledExecutorService scheduleWithFixedDelay����
			//�������Գ�ʼ�ӳ���������ִ�У�Ȼ���Ը������ӳ�ִ�С� �ӳ�ʱ���Ǵ��߳����ִ�е�ʱ�俪ʼ
			scheduledThreadPool.scheduleWithFixedDelay(worker, 1, 4,
					TimeUnit.SECONDS);
		}

		// add some delay to let some threads spawn by scheduler
		Thread.sleep(30000);

		scheduledThreadPool.shutdown();
		while (!scheduledThreadPool.isTerminated()) {
			// wait for all tasks to finish
		}
		System.out.println("Finished all threads");
	}

}
