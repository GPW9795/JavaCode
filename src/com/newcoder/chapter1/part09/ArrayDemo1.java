package com.newcoder.chapter1.part09;

/*数组*/
public class ArrayDemo1 {

    public static void main(String[] args) {
        // 静态初始化
        int[] ownNums = {5, 10, 15, 20, 25, 30, 6};

        for (int i = 0; i < ownNums.length; i++) {
            System.out.print(ownNums[i] + "\t");
        }
        System.out.println();
        // 动态初始化
        int[] ranNums = new int[7];
        for (int i = 0; i < 6; i++) {
            ranNums[i] = (int) (Math.random() * 33 + 1);
        }
        ranNums[ranNums.length - 1] = (int) (Math.random() * 16 + 1);

        for (int i = 0; i < ranNums.length; i++) {
            System.out.print(ranNums[i] + "\t");
        }
    }
}
