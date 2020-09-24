package com.newcoder.chapter3.part35;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * String
 */
public class BasicLibraryDemo6 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // 构造器
        String str = new String("Hello 高沛雯");
        System.out.println(str);

        // length
        System.out.println(str.length());

        //getBytes()
        System.out.println(Arrays.toString(str.getBytes()));
        System.out.println(Arrays.toString(str.getBytes("GBK")));

        // ==, equals()
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2); // 地址不一样
        System.out.println(str1.equals(str2)); // 内容一样

        // 直接量存储在方法区内字符串类型的常量池中
        // 内容相同的直接量在常量池中只保存一份
        String str3 = "Hello World"; // 存到常量池，可以复用，节省内存
        String str4 = "Hello World"; // 从常量池中赋给str4
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        String str5 = new String("Hello World"); // 指向堆
        System.out.println(str5 == str4);
        System.out.println(str5.equals(str4));

        // equalsIgnoreCase
        String str6 = "HELLO WORLD";
        System.out.println(str5.equals(str6));
        System.out.println(str5.equalsIgnoreCase(str6));
    }

}
