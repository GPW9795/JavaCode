package com.newcoder.chapter1.part08;

import java.util.Scanner;

/*do while循环*/
public class LoopDemo2 {

    // 输入一个整数，计算它的位数
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入整数");
        int num = scan.nextInt();
        scan.close();

        int len = 0;

        do {
            num /= 10;
            len++;
            System.out.println("len=" + len + ", num=" + num);
        } while (num != 0);

        System.out.println(len);
    }
}
