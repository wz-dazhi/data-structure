package com.wz.sort.simple;

/**
 * @projectName: data-structure
 * @package: com.wz.sort.simple
 * @className: BubbleSort
 * @description: 冒泡排序
 * @author: wangzhi
 * @createDate: 2018/4/19 21:50
 **/
public class BubbleSort {

    /**
     * 冒泡排序法
     *
     * @param arr
     */
    public static void bubbleSort(long[] arr) {
        long tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            // 从后向前循环进行排序交换
            for (int j = arr.length - 1; j > i; j--) {
                // 如果后面小于前面,进行交换位置
                if (arr[j] < arr[j - 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }
}
