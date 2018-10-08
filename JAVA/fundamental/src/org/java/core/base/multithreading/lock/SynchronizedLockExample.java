package org.java.core.base.multithreading.lock;

public class SynchronizedLockExample implements Runnable{

	private Resource resource;
	
	public SynchronizedLockExample(Resource r){
		this.resource = r;
	}
	
	@Override
	public void run() {
		//ʹ��synchronized���ȡResource�������
		synchronized (resource) {
			resource.doSomething();
		}
		resource.doLogging();
	}
}
