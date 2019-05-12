package com.java.algorithm.lru;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.TimeUnit;

public class LRUAbstractMap extends java.util.AbstractMap {

    /**
     * 检查是否超期线程
     */
    private ExecutorService checkTimePool;

    /**
     * map最大size
     */
    private final static int MAX_SIZE = 1024;

    private final static ArrayBlockingQueue<Node> QUEUE = new ArrayBlockingQueue<>(MAX_SIZE);

    /**
     * 数组
     */
    private Object[] arrays;

    /**
     * 数组长度
     */
    private int arraySize;

    /**
     * 默认数组的大小
     */
    private final static int DEFAULT_ARRAY_SIZE = 1024;

    /**
     * 判断是否停止flag
     */
    private volatile boolean flag = true;

    /**
     * 超时时间
     */
    private final static long EXPIRE_TIME = 60 * 60 * 1000L;

    /**
     * 整个map的大小
     */
    private volatile AtomicInteger size;

    public LRUAbstractMap() {
        arraySize = DEFAULT_ARRAY_SIZE;
        arrays = new Object[arraySize];

        executeCheckTime();
    }

    /**
     * 开启一个线程检查最先放入队列的值是否超期，设置为守护线程
     */
    private void executeCheckTime() {
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().
                setNameFormat("check-thread-%d").
                setDaemon(true).
                build();

        checkTimePool = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(1), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
        checkTimePool.execute(new CheckTimeThread());
    }

    @Override
    public Set<Entry> entrySet() {
        return super.keySet();
    }

    @Override
    public Object put(Object key, Object value) {
        int hash = hash(key);
        // hash的计算方法会决定元素在桶中发生碰撞的几率
        int index = hash % arraySize ;
        Node currentNode = (Node) arrays[index] ;

        if (currentNode == null){
            arrays[index] = new Node(null,null, key, value);

            // 写入队列
            QUEUE.offer((Node) arrays[index]) ;

            sizeUp();
        } else {
            Node cNode = currentNode ;
            Node nNode = currentNode ;

            // 存在就覆盖
            if (nNode.key == key){
                cNode.val = value ;
            }

            while (nNode.next != null){
                // key 存在 就覆盖(简单判断)
                if (nNode.key == key){
                    nNode.val = value ;
                    break ;
                } else {
                    // 不存在就新增链表
                    sizeUp();
                    // 新节点
                    Node node = new Node(nNode,null,key,value) ;

                    // 把节点写入队列,先进先出
                    QUEUE.offer(currentNode) ;

                    cNode.next = node ;
                }

                nNode = nNode.next ;
            }

        }

        return null ;
    }

    @Override
    public Object get(Object key) {
        int hash = hash(key);
        int index = hash % arraySize;
        Node currentNode = (Node) arrays[index];

        if (currentNode == null) {
            return null;
        }

        if (currentNode.next == null) {
            // 更新访问时间
            currentNode.setUpdateTime(System.currentTimeMillis());

            // 没有冲撞
            return currentNode;
        }

        Node nNode = currentNode;
        while (nNode.next != null) {

            if (nNode.key == key) {
                // 更新访问时间
                nNode.setUpdateTime(System.currentTimeMillis());
                return nNode;
            }

            nNode = nNode.next;
        }

        return super.get(key);
    }

    @Override
    public Object remove(Object key) {
        int hash = hash(key);
        int index = hash % arraySize;
        Node currentNode = (Node) arrays[index];

        if (currentNode == null) {
            return null;
        }

        if (currentNode.key == key) {
            sizeDown();
            arrays[index] = null;

            // 移除队列
            QUEUE.poll();
            return currentNode;
        }

        Node nNode = currentNode ;
        while (nNode.next != null){
            if (nNode.key == key){
                sizeDown();
                //在链表中找到了 把上一个节点的 next 指向当前节点的下一个节点
                nNode.pre.next = nNode.next ;
                nNode = null ;
                //移除队列
                QUEUE.poll();
                return nNode;
            }
            nNode = nNode.next ;
        }

        return super.remove(key);
    }

    /**
     * 增加size
     */
    private void sizeUp() {
        //在put值时候认为里边已经有数据了
        flag = true ;

        if(size == null) {
            size = new AtomicInteger();
        }
        int size = this.size.incrementAndGet();
        if (size >= MAX_SIZE) {
            // 找到队列头的数据
            Node node = QUEUE.poll();
            if (node == null) {
                throw new RuntimeException("data error");
            }

            // 移除该 key
            Object key = node.key;
            remove(key);
            lruCallback();
        }
    }

    /**
     * 数量减少
     */
    private void sizeDown() {
        if(QUEUE.size() == 0) {
            flag = false;
        }

        size.decrementAndGet();
    }

    @Override
    public int size() {
        return size.get();
    }

    /**
     * 拷贝HashMap的hash实现
     */
    public int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    private void lruCallback() {
        System.out.println("lruCallback");
    }

    /**
     * 链表节点
     */
    private class Node {

        private Node next;
        private Node pre;
        private Object key;
        private Object val;
        private Long updateTime;

        public Node(Node pre,Node next,Object key,Object val) {
            this.pre = pre;
            this.next = next;
            this.key = key;
            this.val = val;
            this.updateTime = System.currentTimeMillis();
        }

        public void setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
        }

        public Long getUpdateTime() {
            return updateTime;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", val=" + val +
                    ",";
        }
    }

    private class CheckTimeThread implements Runnable {

        @Override
        public void run() {

        }
    }
}
