package org.java.core.base.multithreading.synchronization;

/**
 * Notice that hacker code is getting lock on class monitor 
 * and not releasing it, it will cause deadlock and DoS in the system.
 * <p>
 * <p>��ע�⣬�ڿʹ�������������ϻ�����������ͷ�������������ϵͳ�е�������DoS��
 */
public class HackerCodeExample3 {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new HackerRunnable3());
		t1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("execute myObject.doSomething");
		MyObject3.doSomething();
		System.out.println("execute myObject.doSomething over");
	}
}

class MyObject3
{
	//locks on the class object's monitor
	//���������ļ���������������ǰ�����static synchronized�ؼ���
	//�ȼ��ڴ˷������õ�ǰ���class������.
	public static synchronized void doSomething() {
		System.out.println("Myobject doSomething");
		//....
	}
}

class HackerRunnable3 implements Runnable
{
	@Override
	public void run() {
		synchronized(MyObject3.class) {
			while(true) {
				//Hacker code
				System.out.println("Hacker code running");
				try {
					Thread.sleep(1000);
//				    Thread.sleep(Integer.MAX_VALUE); // Indefinitely delay MyObject
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}