package org.java.core.base.multithreading.synchronization;

/**
 * Notice that hacker��s code is trying to lock the myObject
 * instance and once it gets the lock, it��s never releasing 
 * it causing doSomething() method to block on waiting for 
 * the lock, this will cause system to go on deadlock and 
 * cause Denial of Service (DoS).
 */
public class HackerCodeExample1 {
	
	public static void main(String[] args) {
		MyObject myObject = new MyObject();
		Thread t1 = new Thread(new HackerRunnable(myObject));
		t1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("execute myObject.doSomething");
		myObject.doSomething();
		System.out.println("execute myObject.doSomething over");
	}
}

class MyObject
{
	//Locks on the object's monitor
	//��������ļ���������������ǰ�����synchronized�ؼ���
	//�ȼ��ڴ˷������õ�ǰ��������.
	public synchronized void doSomething() {
		System.out.println("Myobject doSomething");
		//....
	}
}

class HackerRunnable implements Runnable
{
	private MyObject obj;
	public HackerRunnable(MyObject obj) {
		this.obj = obj;
	}
	
	@Override
	public void run() {
		synchronized(obj) {
			while(true) {
				//Hacker code
				System.out.println("Hacker code running");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}