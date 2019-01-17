package org.java.core.base.multithreading.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyLockExample implements Runnable {

	private Resource resource;
	private Lock lock;

	public ConcurrencyLockExample(Resource r) {
		this.resource = r;
		this.lock = new ReentrantLock();
	}

	@Override
	public void run() {
		//�������������ģ�������ʹ��tryLock����������ȷ���ҵ��߳�ֻ�ȴ�һ����ʱ�䣬
		//�����û�л�ö����������ִֻ��doLogging()
		
		//try-finally����ȷ����ʹdoSomething�������������׳��κ��쳣Ҳ���ͷ�������
		try {
			//tryLock�ȴ���ĳһ��������ʱ��
			if (lock.tryLock(10, TimeUnit.SECONDS)) {
				resource.doSomething();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// release lock
			lock.unlock();
		}
		resource.doLogging();
	}

}
