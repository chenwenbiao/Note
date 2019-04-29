package com.java.algorithm.sort.MergeSort;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

// 有一些排序算法如归并排序、快速排序等可以分解为子问题的
// 算法是可以使用多线程来加速排序的

// fork/join框架充分运用了CPU的计算能力
public class ForkJoinMergeSortTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int length = 200000000;
        int[] array = new int[length];

        //随机产生整数
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int x = random.nextInt(100000);
            array[i] = x;
        }

        long start = System.currentTimeMillis();

        int[] tmp = new int[length];
        ForkJoinMergeSort task = new ForkJoinMergeSort(array, tmp, 0, length - 1);

        //fork/join框架测试(用时：34635毫秒)
        ForkJoinPool pool = new ForkJoinPool(2);
        pool.invoke(task);
        if (task.isCompletedNormally()) {
            System.out.println("UsedTime: " + (System.currentTimeMillis() - start));
        }

        //单线程测试(用时：59349毫秒)
        /*task.sort(com.java.datastructure.array, tmp, 0, length-1);
　　　　  System.out.println("UsedTime: " + (System.currentTimeMillis() - start));
        */

        for (int i = 0; i < 500; i++) {
            System.out.println(array[i]);
        }
    }
}

class ForkJoinMergeSort extends RecursiveAction {

    private static final long serialVersionUID = 3076674975132715659L;
    private final int[] array;
    private final int[] tmp;
    private int first;
    private int last;

    public ForkJoinMergeSort(int[] array, int[] tmp, int first, int last) {
        this.array = array;
        this.tmp = tmp;
        this.first = first;
        this.last = last;
    }

    @Override
    protected void compute() {
        //1. 当排序项分解成少于10000时直接执行归并排序算法
        if (last - first < 10000) {
            sort(array, tmp, first, last);
        } else {
            //2. 当排序项大于10000时，将数组分成两部分(由框架根据条件自动递归分解，直到项数少于10000为止）
            int middle = (first + last) / 2;
            ForkJoinMergeSort t1 = new ForkJoinMergeSort(array, tmp, first, middle);
            ForkJoinMergeSort t2 = new ForkJoinMergeSort(array, tmp, middle + 1, last);
            invokeAll(t1, t2);
            //3. 递归归并排序被分解的两组数字
            merge(array, tmp, first, middle + 1, last);
        }
    }

    /**
     * 归并排序
     */
    public void sort(int[] array, int[] tmp, int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            sort(array, tmp, first, middle);
            sort(array, tmp, middle + 1, last);
            merge(array, tmp, first, middle + 1, last);
        }
    }

    /**
     * 归并
     */
    private void merge(int[] array, int[] tmp, int leftStart, int rightStart, int rightEnd) {
        int leftEnd = rightStart - 1;
        int tmpPos = leftStart;
        int total = rightEnd - leftStart + 1;
        while (leftStart <= leftEnd && rightStart <= rightEnd) {
            if (array[leftStart] <= array[rightStart]) {
                tmp[tmpPos++] = array[leftStart++];
            } else {
                tmp[tmpPos++] = array[rightStart++];
            }
        }
        while (leftStart <= leftEnd) {
            tmp[tmpPos++] = array[leftStart++];
        }
        while (rightStart <= rightEnd) {
            tmp[tmpPos++] = array[rightStart++];
        }
        for (int i = 0; i < total; i++, rightEnd--) {
            array[rightEnd] = tmp[rightEnd];
        }
    }
}