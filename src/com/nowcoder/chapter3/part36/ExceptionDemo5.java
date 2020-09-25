package com.nowcoder.chapter3.part36;

/**
 * 异常跟踪栈
 */
public class ExceptionDemo5 {

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
//        throw new RuntimeException("error");
//        Integer.parseInt("abc");
        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("整数解析失败！");
            e.printStackTrace();
//            throw e;
        }
    }
}
