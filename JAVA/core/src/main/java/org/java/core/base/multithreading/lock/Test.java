package org.java.core.base.multithreading.lock;

/**
 * ���һ���߳̽���foo���������ͻ�����Test����(it has the lock on Test object),
 * ���Ե�������ִ��bar��������ʱ�����߳��Ǳ������ȥִ��bar����������
 * ��Ϊ��������Test�����ϵ���,������ͬsynchronized(this).
 * @author a
 *
 */
public class Test {
	
	public synchronized void foo(){
	    //do something
		bar();
	}

	public synchronized void bar(){
		//do some more
	}
}
