package com.newcoder.part09;

/*遍历数组*/
public class ArrayDemo2 {

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 1, 5, 4, 6};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        double min = arr[0];
        for (double n : arr) {
            if (n < min) {
                min = n;
            }
        }
    }
}
