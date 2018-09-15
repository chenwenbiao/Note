package org.java.core.base.multithreading.simple;

/**
 * Java Thread join������������ͣ��ǰ�߳�ִ�У�����ָ�����߳�������
 * There are three overloaded join functions.
 * <p>
 * <strong>public final void join():</strong><br>
 * <strong>public final synchronized void join(long millis):</strong><br>
 * �ȴ�����join���߳�to be dead or wait for specified milliseconds. 
 * Since thread execution depends on OS implementation, 
 * it doesn��t guarantee that the current thread will wait only for given time.
 * <strong>public final synchronized void join(long millis, int nanos):</strong><br>
 */
public class ThreadJoinExample
{
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable(), "t1");
		Thread t2 = new Thread(new MyRunnable(), "t2");
		Thread t3 = new Thread(new MyRunnable(), "t3");
		
		t1.start();
		
        //start second thread after waiting for 2 seconds or if it's dead
		try {
			//pause main thread 2000 milliseconds.
			//main thread�ȴ�t1 2�룬�������2����t1��Ϊdead��main thread�Ż����ִ��
			t1.join(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		
		//start third thread only when first thread is dead.
		//ֻ�е���һ���߳�����ʱ�򣬻���ִ����ɣ���ȥstart�������߳�,Ҳ����ֻ�еȵ�һ���߳�ִ�����(��Ϊdead״̬)�����߳�
		//�����¼���ִ��
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t3.start();
		
        //let all threads finish execution before finishing main thread
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("All threads are dead, exiting main thread");
	}
}

class MyRunnable implements Runnable
{
	@Override
	public void run() {
		System.out.println("Thead started:::" + Thread.currentThread().getName());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread ended:::" + Thread.currentThread().getName());
	}
}