package com.newcoder.part08;

import java.util.Scanner;

/*while循环*/
public class LoopDemo1 {

    // 输入一个整数，计算它的位数
    // 258/10=25,25/10=2,2/10=0
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入整数");
        int num = scan.nextInt();
        scan.close();

        int len = 0;
        while (num != 0) {
            num /= 10;
            len++;
            System.out.println("len=" + len + ", num=" + num);
        }

        len = len == 0 ? 1 : len;

        System.out.println(len);
    }
}
