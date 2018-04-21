package com.wz.sort.simple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @projectName: data-structure
 * @package: com.wz.sort.simple
 * @className: SortTest
 * @description:
 * @author: wangzhi
 * @createDate: 2018/4/19 21:54
 **/
public class SortTest {

    private long[] arr;

    @Before
    public void setUp() throws Exception {
        arr = new long[5];
        arr[0] = 24;
        arr[1] = 18;
        arr[2] = 30;
        arr[3] = 52;
        arr[4] = 1;
        display();
    }

    @After
    public void tearDown() throws Exception {
        display();
    }

    @Test
    public void sort() {
//        BubbleSort.sort(arr);
//        SelectionSort.sort(arr);
        InsertSort.sort(arr);
    }

    /**
     * 打印
     */
    private void display() {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }
}