package com.nowcoder.chapter1.part10;

/*方法重载*/
public class MethodDemo4 {

    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println(sum(4.1,5,7.6));
    }

    public static int sum(int... nums) {
        System.out.println("sum for int");
        int s = 0;
        for (int num : nums) {
            s += num;
        }
        return s;
    }

    public static double sum(double... nums){
        System.out.println("sum for double");
        double s = 0;
        for (double num : nums) {
            s += num;
        }
        return s;
    }
}
