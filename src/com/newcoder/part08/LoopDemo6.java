package com.newcoder.part08;

import java.util.Scanner;

/*break*/
public class LoopDemo6 {

    // 输入正整数n(n>1)，计算1~n之间所有奇数的和
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        if (n <= 1) {
            System.out.println("wrong");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    continue;
                }
                sum += i;
            }
            System.out.println("sum=" + sum);
        }

    }
}
