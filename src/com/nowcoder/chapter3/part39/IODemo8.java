package com.nowcoder.chapter3.part39;

import java.io.*;
import java.util.Scanner;

/**
 * 重定向
 */
public class IODemo8 {

    public static void main(String[] args) {
//        testRedirectOutput();
        testRedirectInput();
    }

    public static void testRedirectOutput() {
        try (
                PrintStream ps = new PrintStream(new FileOutputStream(
                        "/Users/gaopeiwen/Desktop/work/Alpha/our.txt"));
        ) {
            System.setOut(ps);
            System.out.println("hhhhhhhh");
            System.out.println("sdfjdgkdfgk");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void testRedirectInput() {
        try (
                FileInputStream fis = new FileInputStream("/Users/gaopeiwen/Desktop/work/Alpha/our.txt");
        ) {
            System.setIn(fis);
            Scanner scanner = new Scanner(System.in);
            // 此时输入源是文件
            while(scanner.hasNext()){
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
