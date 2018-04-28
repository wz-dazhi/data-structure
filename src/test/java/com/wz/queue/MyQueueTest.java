package com.wz.queue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @projectName: data-structure
 * @package: com.wz.queue
 * @className: MyQueueTest
 * @description:
 * @author: wangzhi
 * @createDate: 2018/4/28 22:15
 **/
public class MyQueueTest {

    private MyQueue myQueue;

    @Before
    public void setUp() throws Exception {
        myQueue = new MyQueue(4);
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
        // 上面将队列删除完了之后,再插入数据会导致下标越界,因为不是循环队列,已经没有位置插入数据
//        myQueue.insert(3);
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