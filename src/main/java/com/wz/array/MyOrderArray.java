package com.wz.array;

/**
 * @projectName: data-structure
 * @package: com.wz.array
 * @className: MyOrderArray
 * @description: 自定义有序数组
 * @author: wangzhi
 * @createDate: 2018/4/18 21:13
 **/
public class MyOrderArray {

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
    public MyOrderArray(int maxSize) {
        array = new long[maxSize];
    }

    /**
     * 默认数组长度
     */
    public MyOrderArray() {
        array = new long[50];
    }

    /**
     * 添加数据,有序数组在添加数据的时候进行判断
     *
     * @param value
     */
    public void add(long value) {
        int i;
        // 循环查找,如果数组中的数据大于要插入的数据,break
        for (i = 0; i < elements; i++) {
            if (array[i] > value) {
                break;
            }
        }
        // 数据中的数据向后移
        for (int j = elements; j > i; j--) {
            array[j] = array[j - 1];
        }
        // 将数据插入到空出来的位置中
        array[i] = value;
        elements++;
    }

    /**
     * 二分查找,根据数据返回索引(只能查找有序数组)
     *
     * @param value
     * @return
     */
    public int binarySearch(int value) {
        int middle = 0;
        int low = 0;
        int pow = elements;
        while (true) {
            middle = (low + pow) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (low > pow) {
                return -1;
            } else {
                // 判断向左查找还是向右查找
                if (array[middle] > value) {
                    pow = middle - 1;
                } else {
                    low = middle + 1;
                }
            }
        }
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
