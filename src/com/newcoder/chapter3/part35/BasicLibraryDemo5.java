package com.newcoder.chapter3.part35;

/**
 * 包装类详解
 */
public class BasicLibraryDemo5 {

    public static void main(String[] args) {
        // 不可变
        Integer i = 100;
        i = 200;

        // Number
        Double d = 200.789;
        System.out.println(d.intValue());
        System.out.println(d.byteValue());

        // NumberFormatException
//        byte b = Byte.parseByte("abc");

        // 静态常量
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
    }

}
