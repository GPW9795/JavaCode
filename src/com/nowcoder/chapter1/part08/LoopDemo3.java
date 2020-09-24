package com.nowcoder.chapter1.part08;

import java.util.Scanner;

/*for循环*/
public class LoopDemo3 {

    //输入一个自然数，计算阶乘
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入整数");
        int n = scan.nextInt();
        scan.close();

        if (n < 0) {
            System.out.println("错误");
        } else if (n == 0) {
            System.out.println("0!=1");
        } else {
            long s = 1;
            for (int i = 1; i <= n; i++) {
                s *= i;
            }
            System.out.println("n!=" + s);
        }
    }

}
