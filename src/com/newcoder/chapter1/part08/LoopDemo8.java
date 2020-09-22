package com.newcoder.chapter1.part08;

import java.util.Scanner;

/*死循环*/
public class LoopDemo8 {

    // 输入任意多个整数（负数为结束），求他们的平均数
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int amount = 0;

        while (true) {
            int n = scan.nextInt();
            if (n < 0) {
                break;
            }
            sum += n;
            amount++;
        }
        scan.close();

        if (amount > 0) {
            double avg = (double) sum / amount;
            System.out.println(avg);
        }
    }
}
