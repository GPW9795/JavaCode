package com.newcoder.part09;

import java.lang.reflect.Array;
import java.util.Arrays;

/*内存中的数组*/
public class ArrayDemo4 {

    public static void main(String[] args) {
        // arr1 = 0x11
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        arr1[0] = 11;
        arr2[1] = 22;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr1);
        System.out.println(arr2);
    }
}
