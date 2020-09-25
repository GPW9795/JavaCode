package com.nowcoder.chapter3.part36;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 回收资源
 */
public class ExceptionDemo2 {

    public static void main(String[] args) {
//        process1("C:\\javacode\\2.txt");
//        process2("C:\\javacode\\2.txt");
        System.out.println(process3("abc"));
    }

    public static void process1(String fileName) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
            System.out.println("Read File...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        } finally {
            try {
                System.out.println("Close File...");
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void process2(String fileName) {
        try (
                FileInputStream fis = new FileInputStream(fileName);
        ) {
            System.out.println("Read File...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int process3(String str){
        try {
            int i = Integer.parseInt(str);
            return i;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0;
        } finally {
            // 一般不要在这里返回数据或抛出异常
            return -1;
        }
    }
}
