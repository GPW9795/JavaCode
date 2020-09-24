package com.nowcoder.chapter1.part09;

import java.util.Arrays;

/*Array工具类*/
public class ArrayDemo3 {

    public static void main(String[] args) {
        // 打印数组
        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        // 比较数组
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println(arr1 == arr2);
        System.out.println(Arrays.equals(arr1, arr2));

        // 排序数组
        int[] arr3 = {20, 40, 10, 30, 50};
        Arrays.sort(arr3);// 快速排序
        System.out.println(Arrays.toString(arr3));

        // 复制数组
        int[] arr4 = Arrays.copyOf(arr3, 9);
        System.out.println(Arrays.toString(arr4));

        // 数组扩容
        int[] ownNums = {5, 10, 15, 20, 25, 30, 6};
        ownNums = Arrays.copyOf(ownNums, ownNums.length + 1);
        ownNums[ownNums.length - 1] = (int) (Math.random() * 16 + 1);
        System.out.println(Arrays.toString(ownNums));
    }
}
