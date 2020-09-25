package com.nowcoder.chapter3.part36;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 抛出异常
 */
public class ExceptionDemo3 {

    public static void main(String[] args) {
//        try {
//            process1(args);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("数组下标越界：" + e.getMessage());
//        } catch (NumberFormatException e) {
//            System.out.println("数字格式错误：" + e.getMessage());
//        } catch (ArithmeticException e) {
//            System.out.println("数学运算失败：" + e.getMessage());
//        }

//        try {
//            process2("C:\\javacode\\2.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("文件不存在：" + e.getMessage());
//        }

//        try {
//            process3("");
//        } catch (FileNotFoundException e) {
//            System.out.println("文件不存在：" + e.getMessage());
//        }

        try {
            System.out.println(divide(3, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("非法参数：" + e.getMessage());
        }
    }

    public static void process1(String[] args) throws ArrayIndexOutOfBoundsException, NumberFormatException, ArithmeticException {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        System.out.println("m / n = " + (m / n));
    }

    public static void process2(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
    }

    public static void process3(String fileName) throws FileNotFoundException {
        if (fileName == null || fileName.equals("")) {
            throw new FileNotFoundException("file can't be null.");
        }
    }

    public static double divide(double m, double n) throws IllegalArgumentException{
        if (n == 0.0) {
            throw new IllegalArgumentException("n can't be zero.");
        }
        return m / n;
    }
}
