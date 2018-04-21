package com.wz.sort.simple;

/**
 * @projectName: data-structure
 * @package: com.wz.sort.simple
 * @className: SelectionSort
 * @description: 选择排序
 * @author: wangzhi
 * @createDate: 2018/4/21 22:28
 **/
public class SelectionSort {

    /**
     * 选择排序, i 表示多少趟, k 表示永远指向最小的数据, j 内循环跟k比较
     *
     * @param arr
     */
    public static void sort(long[] arr) {
        int k;
        long tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            k = i;
            for (int j = i; j < arr.length; j++) {
                // 如果发现j比k小, 那么就把k指向j
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[k];
            arr[k] = tmp;
        }
    }
}
