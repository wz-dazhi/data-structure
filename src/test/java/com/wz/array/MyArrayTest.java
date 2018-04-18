package com.wz.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.ARG_OUT;

import static org.junit.Assert.*;

/**
 * @projectName: data-structure
 * @package: com.wz.array
 * @className: MyArrayTest
 * @description:
 * @author: wangzhi
 * @createDate: 2018/4/18 21:59
 **/
public class MyArrayTest {

    private MyArray array;

    @Before
    public void setUp() throws Exception {
        array = new MyArray();
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
    public void add() {
    }

    @Test
    public void display() {
    }

    @Test
    public void search() {
        System.out.println(array.search(0));
    }

    @Test
    public void get() {
        System.out.println(array.get(3));
    }

    @Test
    public void delete() {
        array.delete(2);
    }

    @Test
    public void update() {
        array.update(0,100);
    }
}