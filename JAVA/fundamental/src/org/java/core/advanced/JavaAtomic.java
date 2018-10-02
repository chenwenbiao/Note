package org.java.core.advanced;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * ԭ�Ӳ����ڵ�������Ԫ��ִ�У��������������ĸ��� �ڶ��̻߳����б������ԭ�Ӳ����Ա������ݲ�һ�¡�
 *
 */
public class JavaAtomic {
	
    public static void main(String[] args) throws InterruptedException {
    	ProcessingThread pt = new ProcessingThread();
    	Thread t1 = new Thread(pt, "thread1");
    	t1.start();
    	Thread t2 = new Thread(pt, "thread2");
    	t2.start();
    	t1.join();
    	t2.join();
    	System.out.println("Processing count=" + pt.getCount());
    }
}

//class ProcessingThread implements Runnable {
//    private int count;
//
//    @Override
//    public void run() {
//        for (int i = 1; i < 5; i++) {
//            processSomething(i);
//            count++;
//        }
//    }
//
//    public int getCount() {
//        return this.count;
//    }
//
//    private void processSomething(int i) {
//        // processing some job
//        try {
//            Thread.sleep(i * 1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}

//�����������������������ע�⵽����ֵ��5,6,7,8֮��仯��
//ԭ������Ϊcount++����ԭ�Ӳ����� ����count=4����һ���̶߳�ȡ����ֵ���������1ʱ���������ʱ��count�ڵ�ǰ
//�߳��в�û�����count+1֮����ֵ5��ֵ��count�Ĳ��������������̶߳�ȡ��count���Ǿɵ�count(4)��
//�Ӷ����´���Ľ����

class ProcessingThread implements Runnable {
    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            processSomething(i);
            count.incrementAndGet();
        }
    }

    public int getCount() {
        return this.count.get();
    }

    private void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

//ʹ�ò��������ԭ�Ӳ����ĺô������ǲ���Ҫ����ͬ����
//������˴���Ŀɶ��ԣ������˴���Ŀ����ԡ�ʹ�ò��������ԭ�Ӳ������漰������Դ��ͬ������Ч��
