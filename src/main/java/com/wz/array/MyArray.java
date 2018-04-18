package com.wz.array;

/**
 * @projectName: data-structure
 * @package: com.wz.array
 * @className: MyArray
 * @description: 自定义数组
 * @author: wangzhi
 * @createDate: 2018/4/18 21:13
 **/
public class MyArray {

    private long[] array;
    /**
     * 数组的有效长度
     */
    private int elements;

    /**
     * 指定数组长度
     *
     * @param maxSize
     */
    public MyArray(int maxSize) {
        array = new long[maxSize];
    }

    /**
     * 默认数组长度
     */
    public MyArray() {
        array = new long[50];
    }

    /**
     * 添加数据
     *
     * @param value
     */
    public void add(long value) {
        array[elements] = value;
        elements++;
    }

    /**
     * 打印数据
     */
    public void display() {
        System.out.print("[");
        for (int i = 0; i < elements; i++) {
            if (i == elements - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println("]");
    }

    /**
     * 根据数据返回索引
     *
     * @param value
     * @return
     */
    public int search(long value) {
        int i;
        for (i = 0; i < elements; i++) {
            if (array[i] == value) {
                break;
            }
        }
        if (i == elements) {
            return -1;
        }
        return i;
    }

    /**
     * 根据索引返回数据
     *
     * @param index
     * @return
     */
    public long get(int index) {
        if (index < 0 || index >= elements) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return array[index];
        }
    }

    /**
     * 删除数据
     */
    public void delete(int index) {
        if (index < 0 || index >= elements) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            for (int i = index; i < elements; i++) {
                array[i] = array[i + 1];
            }
            elements--;
        }
    }

    /**
     * 根据索引更新数据
     *
     * @param index
     * @param newValue
     */
    public void update(int index, long newValue) {
        if (index < 0 || index >= elements) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            array[index] = newValue;
        }
    }

}
