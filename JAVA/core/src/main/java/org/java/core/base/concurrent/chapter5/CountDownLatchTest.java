package org.java.core.base.concurrent.chapter5;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    /**
     * 在下面的例子中，主线程就是调用线程，主线中设置了CountDownLatch的值为2，并
     * 启动两个线程，每个线程执行完成之后将CountDownLatch减1
     * ，最后主线程中调用了latch.await()。此时主线程就会等到CountDownLatch值为0时才能继续往下执行。
     * 也是说，必须等到两个线程执行完成之后，才能执行。
     *
     * 需要注意的是，如果CountDownLatch设置的值大于2的话，那么主线程就会一直等待下去，
     * 因为CountDownLatch的值即使减去2次，还是大于0，主线程只能一直等待。
     *
     *  如果不想一直等待下去，可以调用其
     *
     * public boolean await(long timeout, TimeUnit unit)
     * 返回true表示指定时间内所有线程执行完，返回false表示指定时间内，所有线程没有执行完
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{
        final CountDownLatch latch = new CountDownLatch(2);

        new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("子线程: " + Thread.currentThread().getName() + "正在执行");
                    Thread.sleep(3000);
                    System.out.println("子线程: " + Thread.currentThread().getName() + "执行完毕");
                    latch.countDown();//将count值减1
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread(){
            public void run() {
                try {
                    System.out.println("子线程"+Thread.currentThread().getName()+"正在执行");
                    Thread.sleep(3000);
                    System.out.println("子线程"+Thread.currentThread().getName()+"执行完毕");
                    latch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        }.start();

        System.out.println("等待2个子线程执行完毕..");
        // 调用await()方法的线程会被挂起，它会等待直到count值为0才继续执行
        latch.await();
        System.out.println("2个子线程已经执行完毕...");
        System.out.println("继续执行主线程");
    }
}