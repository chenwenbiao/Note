package org.java.core.base.multithreading.lock;

public class Resource {

	public void doSomething(){
		//do some operation, DB read, write etc
	}
	
	public void doLogging(){
		//logging, no need for thread safety
	}
}