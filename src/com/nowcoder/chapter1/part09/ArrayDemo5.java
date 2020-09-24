package com.nowcoder.chapter1.part09;

import java.util.Arrays;

/*多维数组*/
public class ArrayDemo5 {

    public static void main(String[] args) {
        // 静态初始化
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.deepToString(arr1));

        // 动态初始化
        int[][] arr2 = new int[5][2];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println(Arrays.deepToString(arr2));

        // 遍历二维数组
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.print("\n");
        }

        // 本质是一位数组
        int[][] arr3 = new int[3][];
        arr3[0] = new int[]{1, 2};
        arr3[1] = new int[]{3, 4, 5};
        arr3[2] = new int[]{6, 7, 8, 9};
        System.out.println(Arrays.deepToString(arr3));

        // 更多维度
        int[][][] arr4 = {
                {{11, 12}, {13, 14}},
                {{21, 22}, {23, 24}},
                {{31, 32}, {33, 34}}
        };
        System.out.println(Arrays.deepToString(arr4));
    }
}