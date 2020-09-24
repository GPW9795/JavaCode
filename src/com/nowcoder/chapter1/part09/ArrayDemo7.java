package com.nowcoder.chapter1.part09;


import java.util.Arrays;
import java.util.Scanner;

/*求平均值*/
public class ArrayDemo7 {
    public static void main(String[] args) {
        // 存储数字
        int[] nums = new int[5];
        // 数组存放的位置index
        int index = 0;

        // 记录
        Scanner scan = new Scanner(System.in);
        while (true) {
            nums[index] = scan.nextInt();

            if (nums[index] < 0) {
                break;
            }
            // 下标迭代,若越界则扩容
            if (++index > nums.length - 1) {
                nums = Arrays.copyOf(nums, nums.length + 5);
            }
        }
        scan.close();
//        System.out.println(Arrays.toString(nums));
        int sum = 0;
        int amount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                break;
            }
            sum += nums[i];
            amount++;
        }

        if (amount > 0) {
            double avg = (double) sum / amount;
            System.out.println(avg);

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0) {
                    break;
                }
                if (nums[i] > avg) {
                    System.out.print(nums[i] + "\t");
                }
            }
        }
    }
}
