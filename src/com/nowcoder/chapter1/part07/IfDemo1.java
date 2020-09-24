package com.nowcoder.chapter1.part07;

import java.util.Scanner;

/* if语句的第一种形式 */
public class IfDemo1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = scan.nextInt();
        scan.close();

        if (age >= 18) {
            System.out.println("已成年可以访问");
        }
    }
}
