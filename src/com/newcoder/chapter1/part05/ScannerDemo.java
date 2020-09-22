package com.newcoder.chapter1.part05;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner scan = new Scanner(System.in);

        // 开始输入
        System.out.print("请输入你的名字：");
        String name = scan.nextLine();

        System.out.print("请输入你的年龄：");
        int age = scan.nextInt();

        System.out.print("请输入你的月薪：");
        double salary = scan.nextDouble();

        // 关闭Scanner
        scan.close();

        // 处理输入的内容
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("月薪：" + salary);
    }
}
