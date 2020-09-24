package com.nowcoder.chapter1.part07;

import java.util.Scanner;

/* if语句的第三种形式 */
public class IfDemo3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = scan.nextInt();
        scan.close();

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
