package org.java.core.base.multithreading.Callable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Java Callable��Future�ڶ��̱߳���о���ʹ�ã�����ѧ���˺ܶ����java�̵߳�֪ʶ��
 * ����ʱ����ϣ���߳̿��Է���һЩ���ǿ���ʹ�õ�ֵ��
 * Java 5�ڲ�������������java.util.concurrent.Callable�ӿڡ�
 * <p><br>
 * Java Callable�ӿ�ʹ��Generic������Object�ķ�������,
 * Executors���ṩ�����̳߳���ִ��Java Callable�����÷���,
 * ���ڿɵ������������У����Ǳ���ȴ����ص�Object��
 * <p>
 * <strong>Java Future</strong><br><br>
 * Java Callable tasks return java.util.concurrent.Future object. Using Java 
 * Future object, we can find out the status of the Callable task and get the 
 * returned Object. It provides get() method that can wait for the Callable to 
 * finish and then return the result.
 * Java Callable���񷵻�Future������Java Future�������ǿ����ҵ�Callable����� ״̬������
 * �õ����صĶ������ṩ��get�������Եȴ�Callable��ɣ�Ȼ�󷵻ؽ����
 * <p>
 * Java Future�ṩcancel����������ȡ��������Callable����
 * ��һ��get�������������ذ汾�����ǿ���ָ���ȴ������ʱ�䣬
 * ���⵱ǰ�̱߳���������ʱ�������õ�,��isDone������isCancelled����
 * ���������ҹ�����Callable����ĵ�ǰ״̬��
 * <p>
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
    	System.out.println("- call - ");
        Thread.sleep(3000);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
    }
    
    // ����ʹ��Executor��ܲ���ִ��100�����񣬲�ʹ��Java Future��ȡ�ύ����Ľ����
    public static void main(String args[]){
        //Get ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService executor = Executors.newFixedThreadPool(10);
        
        //create a list to hold the Future object associated with Callable
        List<Future<String>> list = new ArrayList<Future<String>>();
        
        //Create MyCallable instance
        Callable<String> callable = new MyCallable();
        
        for(int i=0; i< 100; i++){
            //submit Callable tasks to be executed by thread pool
            Future<String> future = executor.submit(callable);
            
            //add Future to the list, we can get return value using Future
            list.add(future);
            System.out.println("list add - " + i);
        }
        
        for(Future<String> fut : list){
            try {
            	//�������û��ִ����ɣ��������ȴ���because Future.get() waits 
            	//for task to get completed
            	
            	//print the return value of Future, notice the output delay in console
                System.out.println(new Date()+ "::"+fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //shut down the executor service now
        executor.shutdown();
    }
}


