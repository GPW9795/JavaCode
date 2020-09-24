package com.nowcoder.chapter1.part03;

public class ConversionDemo {
    public static void main(String[] args) {
        //1.自动类型转换
        char c = 'A';
        int i = c;
        System.out.println(i);

        long l = 100L;
        double d = l;
        System.out.println(d);

        //2.强制类型转换
        int ii = 65;
        char cc = (char) ii;
        System.out.println(cc);

        double dd = 3.14;
        long ll = (long) dd;
        System.out.println(ll);

        //3.运算时自动类型转换
        //1)现将byte,short,char转为int
        //2)再将int转为更大的类型
        char ccc = 'A';
        int iii = 100;
        double ddd = 3.14;
        System.out.println(ccc+iii+ddd);

        byte b = 8;
        b = (byte) (b - 3);

        byte k = 5;
        short m = 6;
        char n = 7;
    }
}
