package org.java.core.base.multithreading.ThreadLifeCycle;

/**
 * ���Java���̵߳����������Լ��̵߳�״̬�Ƕ��ڶ��̳߳���Ļ�����
 * �ǳ���Ҫ�ģ���Java�д���һ��thread������start��������thread
 * ��Runnable��Running�ٵ�Blocked������OS�̵߳�����(thread scheduler)
 * ��ʵ�֣�Java������ȫ������.
 * <p>
 * <strong>New</strong>
 * ��������new ������newһ��Thread�����ʱ���߳�״̬��New Thread.at this point,
 * �̻߳����ǻ�ģ���ֻ��java�����ڲ���״̬
 * <p>
 * <strong>Runnable</strong>
 * When we call start() function on Thread object, 
 * it��s state is changed to Runnable. The control is given to 
 * Thread scheduler to finish it��s execution. Whether to run this 
 * thread instantly or keep it in runnable thread pool before running, 
 * depends on the OS implementation of thread scheduler.
 * <p>
 * <p>Blocked/Waiting</p>
 * A thread can be waiting for other thread to finish using 
 * thread join or it can be waiting for some resources to 
 * available. For example producer consumer problem or waiter 
 * notifier implementation or IO resources, then it��s state is 
 * changed to Waiting. Once the thread wait state is over, it��s 
 * state is changed to Runnable and it��s moved back to runnable thread pool.
 * <p>
 * <strong>Dead</strong>
 * Once the thread finished executing, it��s state is changed to 
 * Dead and it��s considered to be not alive. 
 * <p>
 * Above are the different states of thread. It��s good to know 
 * them and how thread changes it��s 
 * state. That��s all for thread life cycle in java.
 */
public class ThreadLifeCycleInJava {
	
}
