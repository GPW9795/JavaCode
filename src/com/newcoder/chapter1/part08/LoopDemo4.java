package com.newcoder.chapter1.part08;

import java.util.Scanner;

public class LoopDemo4 {

    // 输入任意多个整数（负数代表结束），求他们的平均数
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0; // 输入
        int sum = 0;
        int amount = 0;

        /*do {
            n = scan.nextInt();
            if (n >= 0) {
                sum += n;
                amount++;
            }
        } while (n >= 0);*/

        n = scan.nextInt();
        while (n>=0){
            sum += n;
            amount++;
            n = scan.nextInt();
        }

        if (amount > 0) {
            double avg = (double) sum / amount;
            System.out.println(avg);
        }
        scan.close();
    }
}
