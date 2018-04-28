package com.wz.queue;

/**
 * @projectName: data-structure
 * @package: com.wz.queue
 * @className: MyQueue
 * @description: 自定义队列 特点:先进先出,后进后出
 * @author: wangzhi
 * @createDate: 2018/4/22 13:59
 **/
public class MyQueue {

    private long[] arr;

    /**
     * 有效数据
     */
    private int elements;

    /**
     * 队头
     */
    private int front;

    /**
     * 队尾
     */
    private int tail;

    public MyQueue() {
        arr = new long[10];
        elements = 0;
        front = 0;
        tail = -1;
    }

    public MyQueue(int maxSize) {
        arr = new long[maxSize];
        elements = 0;
        front = 0;
        tail = -1;
    }

    /**
     * 添加数据,队列是从队尾进行插入数据的(现实生活中的排队)
     */
    public void insert(int value) {
        arr[++tail] = value;
        // 有效数据++
        elements++;
    }

    /**
     * 移除数据,队列是从队头进行移除(现实生活中排队的第一个人先出去)
     */
    public long remove() {
        // 有效数据--
        elements--;
        return arr[front++];
    }

    /**
     * 查看数据,只能查看队头的数据
     */
    public long peek() {
        return arr[front];
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty() {
        return elements == 0;
    }

    /**
     * 判断是否满了
     */
    public boolean isFull() {
        return elements == arr.length;
    }

}
