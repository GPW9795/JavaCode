package com.nowcoder.chapter3.part39;

import java.io.*;

/**
 * 打印流
 */
public class IODemo7 {

    public static void main(String[] args) {
        testPrintStream();
        testPrintWriter();
    }

    public static void testPrintStream() {
        try (
                FileOutputStream fos = new FileOutputStream("/Users/gaopeiwen/Desktop/work/Alpha/a.txt");
                PrintStream ps = new PrintStream(fos);
        ) {
            ps.println("hhhhhhh");
            ps.println("ggggggg");
            ps.println("jjjjjjj");
            ps.println("kkkkkkk");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void testPrintWriter() {
        try (
                FileWriter fw = new FileWriter("/Users/gaopeiwen/Desktop/work/Alpha/b.txt");
                PrintWriter pw = new PrintWriter(fw);
        ) {
            pw.println("ggggggg");
            pw.println("hhhhhhh");
            pw.println("jjjjjjj");
            pw.println("kkkkkkk");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
