package com.nowcoder.chapter1.part09;

import java.util.Arrays;

public class ArrayDemo6 {

    public static void main(String[] args) {
        // 方法一
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[5];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[arr.length - 1 - i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));

        // 方法二
        int[] arr3 = new int[5];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length / 2; i++) {
            int temp = arr3[i];
            arr3[i] = arr3[arr3.length-1-i];
            arr3[arr3.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
