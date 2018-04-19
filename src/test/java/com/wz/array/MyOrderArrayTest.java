package com.wz.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @projectName: data-structure
 * @package: com.wz.array
 * @className: MyOrderArrayTest
 * @description: 测试自定义有序数组
 * @author: wangzhi
 * @createDate: 2018/4/19 21:00
 **/
public class MyOrderArrayTest {

    private MyOrderArray array;

    @Before
    public void setUp() throws Exception {
        array = new MyOrderArray();
        array.add(25);
        array.add(20);
        array.add(15);
        array.add(30);
        array.display();
    }

    @After
    public void tearDown() throws Exception {
        array.display();
    }

    @Test
    public void binarySearch() {
        System.out.println(array.binarySearch(15));
    }
}