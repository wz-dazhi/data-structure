package com.wz.sort.simple;

/**
 * @projectName: data-structure
 * @package: com.wz.sort.simple
 * @className: InsertSort
 * @description: 插入排序
 * @author: wangzhi
 * @createDate: 2018/4/21 22:46
 **/
public class InsertSort {

    /**
     * 排序说明: 在首轮，选择第二项作为插入项，然后取出这一项放在一个变量中，
     * 和前一项比较而且小，则前一项后移到第二项的位置，然后第二项也就是插入项放在前一项的位置，
     * 第二轮选择第三项作为插入项然后取出和前一项也就是第二项比较如果小，
     * 第二项后移到插入项，然后插入相在和第一项比较如果小，则第一项后移到第二项，
     * 插入项放在第一项，以此类推。
     *
     * @param arr
     */
    public static void sort(long[] arr) {
        long tmp;
        for (int i = 1; i < arr.length; i++) {
            tmp = arr[i];
            int j = i;
            // 如果j-1 数据比tmp大,则向后移动
            while (j > 0 && arr[j - 1] > tmp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = tmp;
        }
    }
}
