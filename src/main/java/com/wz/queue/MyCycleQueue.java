package com.wz.queue;

/**
 * @projectName: data-structure
 * @package: com.wz.queue
 * @className: MyCycleQueue
 * @description: 自定义队列(循环队列) 特点:先进先出,后进后出
 * @author: wangzhi
 * @createDate: 2018/4/22 13:59
 **/
public class MyCycleQueue {

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

    public MyCycleQueue() {
        arr = new long[10];
        elements = 0;
        front = 0;
        tail = -1;
    }

    public MyCycleQueue(int maxSize) {
        arr = new long[maxSize];
        elements = 0;
        front = 0;
        tail = -1;
    }

    /**
     * 添加数据,队列是从队尾进行插入数据的(现实生活中的排队)
     */
    public void insert(int value) {
        // 循环队列的插入方法,如果队尾已经等于了数据的长度,就重置队尾为-1(初始化的设置)
        if (tail == arr.length - 1) {
            tail = -1;
        }
        arr[++tail] = value;
        // 有效数据++
        elements++;
    }

    /**
     * 移除数据,队列是从队头进行移除(现实生活中排队的第一个人先出去)
     */
    public long remove() {
        long value = arr[front++];
        // 如果队头等于数据的长度了,就重置队头为0(初始化的设置)
        if (front == arr.length) {
            front = 0;
        }
        // 有效数据--
        elements--;
        return value;
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
