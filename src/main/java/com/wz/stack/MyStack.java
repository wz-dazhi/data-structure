package com.wz.stack;

/**
 * @projectName: data-structure
 * @package: com.wz.stack
 * @className: MyStack
 * @description: 自定义栈,底层是一个数组 特点:先进后出,后进先出
 * @author: wangzhi
 * @createDate: 2018/4/22 13:20
 **/
public class MyStack {

    private long[] arr;

    /**
     * 栈顶
     */
    private int top;

    public MyStack() {
        arr = new long[10];
        top = -1;
    }

    public MyStack(int maxSize) {
        arr = new long[maxSize];
        top = -1;
    }

    /**
     * 添加数据
     */
    public void push(int value) {
        arr[++top] = value;
    }

    /**
     * 移除数据,弹出数据
     */
    public long pop() {
        return arr[top--];
    }

    /**
     * 查看数据
     */
    public long peek() {
        return arr[top];
    }

    /**
     * 是否为空
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 是否满了
     */
    public boolean isFull() {
        return top == arr.length - 1;
    }
}
