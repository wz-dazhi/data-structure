package com.wz.queue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @projectName: data-structure
 * @package: com.wz.queue
 * @className: MyCycleQueueTest
 * @description: 循环队列测试
 * @author: wangzhi
 * @createDate: 2018/4/30 13:03
 **/
public class MyCycleQueueTest {

    private MyCycleQueue myQueue;

    @Before
    public void setUp() throws Exception {
        myQueue = new MyCycleQueue(4);
        myQueue.insert(23);
        myQueue.insert(54);
        myQueue.insert(15);
        myQueue.insert(1);

        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.isFull());
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.isFull());
    }

    @Test
    public void insert() {
    }

    @Test
    public void remove() {
        while (!myQueue.isEmpty()) {
            System.out.print(myQueue.remove() + ",");
        }
        System.out.println();
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.isFull());
        // 循环队列重新插入
        myQueue.insert(23);
        myQueue.insert(54);
        myQueue.insert(15);
        myQueue.insert(1);
    }

    @Test
    public void peek() {
        System.out.println(myQueue.peek());
        System.out.println(myQueue.peek());
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void isFull() {
    }
}