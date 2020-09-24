package com.nowcoder.chapter1.part06;

import java.util.Scanner;

public class ShoppingDemo {

    public static void main(String[] args) {
        double price = 128.00;

        // 1.输入购买数量
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入购买数量：");
        int amount = scan.nextInt();
        scan.close();

        // 2.计算应付金额
        double total = price * amount;
        total = total > 500 ? total * 0.9 : total;

        // 3.提示支付结果
        System.out.println("请支付" + total + "元");
    }
}
