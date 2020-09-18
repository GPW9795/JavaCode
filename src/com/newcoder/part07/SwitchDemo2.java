package com.newcoder.part07;

import java.util.Scanner;

public class SwitchDemo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scan.nextInt();
        scan.close();

        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("第一季度");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("第二季度");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("第三季度");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("第四季度");
                break;
            default:
                System.out.println("错误");
        }
    }
}
