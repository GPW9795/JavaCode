package com.newcoder.chapter1.part10;

import java.util.Arrays;

/*方法参数*/
public class MethodDemo2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        swapNum(a, b);
        System.out.println("a=" + a + " b=" + b);

        String c = "1";
        String d = "2";
        swapString(c,d);
        System.out.println("c=" + c + " d=" + d);

        int[] arr = {1,2,3,4,5};
        swapArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swapNum(int m, int n) {
        int t = m;
        m = n;
        n = t;
        System.out.println("m=" + m + " n=" + n);
    }

    public static void swapString(String m, String n) {
        String t = m;
        m = n;
        n = t;
        System.out.println("m=" + m + " n=" + n);
    }

    public static void swapArray(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        int t = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = t;
    }
}
