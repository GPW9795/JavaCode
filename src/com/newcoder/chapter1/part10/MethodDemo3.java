package com.newcoder.chapter1.part10;

/*可变参数*/
public class MethodDemo3 {

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(new int[]{1, 2, 3, 4, 5, 6}));
    }

    public static int sum(int... nums) {
        int s = 0;
        for (int num : nums) {
            s += num;
        }
        return s;
    }
}
