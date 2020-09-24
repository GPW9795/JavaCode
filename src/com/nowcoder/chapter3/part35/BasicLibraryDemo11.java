package com.nowcoder.chapter3.part35;

/**
 * Math
 *
 * @see java.lang.Math
 */
public class BasicLibraryDemo11 {

    public static void main(String[] args) {
        // 常量
        System.out.println(Math.E);
        System.out.println(Math.PI);

        // 绝对值
        System.out.println(Math.abs(-100));
        System.out.println(Math.abs(-100.456));

        // 舍入
        System.out.println(Math.ceil(104.14));
        System.out.println(Math.floor(3.14));

        // 取整
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(3.56));

        //对数
        System.out.println(Math.log(Math.E));
        System.out.println(Math.log10(10));

        // 最值
        System.out.println(Math.max(1, 2));
        System.out.println(Math.min(1.0, 2.0));

        // 乘方
        System.out.println(Math.pow(2, 3.0));
        System.out.println(Math.pow(2.0, 3.0));

        // 平方根
        System.out.println(Math.sqrt(4));
        System.out.println(Math.sqrt(4.0));
    }

}

