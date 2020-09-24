package com.nowcoder.chapter1.part08;

import java.util.Scanner;

/*break*/
public class LoopDemo5 {

    // 输入一个大于1的正整数，判断是否为质数
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        if (n <= 1) {
            System.out.println("wrong");
        } else {
            boolean b = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    b = false;
                    break;
                }
            }
            System.out.println(n + (b ? "是质数" : "不是质数"));
        }

    }
}
