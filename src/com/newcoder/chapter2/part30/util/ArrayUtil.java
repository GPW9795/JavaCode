package com.newcoder.chapter2.part30.util;

// 命令模式
public class ArrayUtil {

    // 冒泡排序，可以排很多东西（牌、大小等）
    public static void sort(int[] arr, Comparator cpr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // 0: 0 ~ arr.length - 1
            // 1: 0 ~ arr.length - 1 - 1
            // 2: 0 ~ arr.length - 1 - 2
            // j + 1 : arr.length - 1 - i
            // j < arr.length - 1 - i
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 比较两值
                if (cpr.compare(arr[j], arr[j + 1]) > 0){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
