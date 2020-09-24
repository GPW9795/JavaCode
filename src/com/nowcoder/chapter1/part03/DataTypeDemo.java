package com.nowcoder.chapter1.part03;

public class DataTypeDemo {
    public static void main(String[] args) {
        System.out.println(9);
        int i = 123;
        i = 2147483647;
        System.out.println(i+1);

        long l = 2;
        l = 30000000000L;

        byte b = 127;
        short s = 32767;
        //s = i;
        //4.float,double
        double d = 0.3;
        float f = 0.8F;
        //不精确性
        System.out.println(300000.02f);
        System.out.println(300000.03f);
        System.out.println(3.3f + 0.1f);

        //5.char
        char c1 = 'A';
        char c2 = 0b01000001;//65
        char c3 = '\u0041'; //unicode(16进制)
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //转义字符
        char c4 = '\'';
        char c5 = '\t';
        char c6 = '\\';
        char c7 = '\n';
        System.out.print(c4);
        System.out.print(c5);
        System.out.print(c6);
        System.out.print(c7);
        //字符串
        String str = "Hello World.";
        System.out.println(str);

        //6.布尔值
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);
        //判断结果是布尔值
        int age = 25;
        System.out.println(age<18);
    }
}
