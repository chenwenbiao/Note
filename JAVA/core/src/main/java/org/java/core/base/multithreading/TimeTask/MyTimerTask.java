package org.java.core.base.multithreading.TimeTask;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * �����������ִ�У�Timer���ȴ�����ɣ�һ����ɣ������ٴδӶ����п�ʼ��һ������
 */
public class MyTimerTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("Timer task started at:" + new Date());
		completeTask();
		System.out.println("Timer task finished at:" + new Date());
	}

	/**
	 * ��ʹ��Timer��������ʱ����Ӧ��ȷ��ʱ���������������߳�ִ�У�
	 * ����������д�С��������������������ʼ��ִ�С�
	 */
	private void completeTask() {
		try {
			// assuming it takes 20 secs to complete the task
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		TimerTask timerTask = new MyTimerTask();
		//���Դ���Java Timer�����Խ����������Ϊ�ػ������߳����С�
		// running timer task as daemon thread
		Timer timer = new Timer(true);
//		 Java Timer object is scheduled to run the task every 10 seconds
		timer.scheduleAtFixedRate(timerTask, 0, 1 * 1000);
		System.out.println("TimerTask started");
		// cancel after sometime
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timer.cancel();
		System.out.println("TimerTask cancelled");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
