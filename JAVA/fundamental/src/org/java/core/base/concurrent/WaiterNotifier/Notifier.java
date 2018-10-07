package org.java.core.base.concurrent.WaiterNotifier;

/**
 * <strong>notify</strong><br>
 * notify method wakes up only one thread waiting on 
 * the object and that thread starts execution. So if 
 * there are multiple threads waiting for an object, 
 * this method will wake up only one of them. The choice
 * of the thread to wake depends on the OS implementation 
 * of thread management
 * notify����ֻ����һ���ȴ��ö�����̣߳����߳̿�ʼִ�С� 
 * ��ˣ�����ж���߳��ڵȴ�������˷���������������һ���� Ҫ���ѵ��̵߳�ѡ��
 * ȡ����OS�̹߳����ʵ�֡�
 * <strong>notifyAll</strong>
 * notifyAll method wakes up all the threads waiting on the object,
 * although which one will process first depends on the OS implementation.
 * notifyAll�������ѵȴ��ö���������̣߳������ĸ��߳̽����ȱ�����ȡ����OSʵ�֡�
 * <p>
 * A class that will process on Message object and then
 * invoke notify method to wake up threads waiting for 
 * Message object. Notice that synchronized block is used 
 * to own the monitor of Message object.
 * ����Message�����ϴ���Ȼ�����notify�����Ի��ѵȴ�Message������̵߳��ࡣ
 * ��ע�⣬synchronized������ʹ��ǰ�߳�ӵ��Message����ļ��������������
 * synchronized block���������쳣: 
 * {@link java.lang.IllegalMonitorStateException} - 
 * if the current thread is not the owner of this object's monitor.
 */
public class Notifier implements Runnable{
	
	private Message msg;
	
	public Notifier(Message msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                msg.setMsg(name+" Notifier work done");
                //�������߳���Message�����ϵȴ�����notify����
                //����ֻ��������һ������һ���߳����ڵȴ����֪ͨ��
//              msg.notify();
                
                msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
