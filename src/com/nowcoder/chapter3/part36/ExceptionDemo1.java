package com.nowcoder.chapter3.part36;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 捕获异常
 */
public class ExceptionDemo1 {

    public static void main(String[] args) {
//        process1(args);
//        process2(args);
//        process3(null);
//        process3("abc");
        process4("C:\\work\\1.txt");
    }

    public static void process1(String[] args) {
        try {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            System.out.println("m / n = " + (m / n));
        } catch (Exception e) {
            System.out.println("###");
            e.printStackTrace();

            System.out.println("###");
            System.out.println(e.getMessage());

            System.out.println("###");
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element);
            }
        }
    }

    public static void process2(String[] args) {
        try {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            System.out.println("m / n = " + (m / n));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界：" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("数字格式错误：" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("数学运算失败：" + e.getMessage());
        } catch (Exception e) {
            System.out.println("未知异常：");
            e.printStackTrace();
        }
    }

    public static void process3(Object obj) {
        String str = obj.toString();
        Integer num = (Integer) obj;
    }

    // Checked异常
    public static void process4(String fileName) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在：" + e.getMessage());
        } catch (Exception e) {
            System.out.println("未知异常：");
            e.printStackTrace();
        }
    }

}
