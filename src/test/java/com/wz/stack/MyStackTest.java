package com.wz.stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @projectName: data-structure
 * @package: com.wz.stack
 * @className: MyStackTest
 * @description:
 * @author: wangzhi
 * @createDate: 2018/4/22 13:25
 **/
public class MyStackTest {

    private MyStack stack;

    @Before
    public void setUp() throws Exception {
        stack = new MyStack(4);
        stack.push(25);
        stack.push(12);
        stack.push(5);
        stack.push(23);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void push() {
    }

    @Test
    public void pop() {
        while (!stack.isEmpty())
            System.out.print(stack.pop() + ",");
        System.out.println();
        System.out.println(stack.isFull());
        System.out.println(stack.isEmpty());
    }

    @Test
    public void peek() {
        System.out.println(stack.peek());
    }

    @Test
    public void isEmpty() {
        System.out.println(stack.isEmpty());
    }

    @Test
    public void isFull() {
        System.out.println(stack.isFull());
    }
}