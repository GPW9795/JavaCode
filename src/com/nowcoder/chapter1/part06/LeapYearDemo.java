package com.nowcoder.chapter1.part06;

import java.util.Scanner;

public class LeapYearDemo {

    public static void main(String[] args) {
        // 输入年份
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scan.nextInt();
        scan.close();

        // 判断闰年
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        // 中文提示
        String result = isLeapYear ? "这是闰年" : "这不是闰年";
        System.out.println(result);
    }
}
