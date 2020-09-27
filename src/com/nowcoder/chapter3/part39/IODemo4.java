package com.nowcoder.chapter3.part39;

import java.io.*;

/**
 * 文件流
 */
public class IODemo4 {

    public static void main(String[] args) {
//        copyFile("/Users/gaopeiwen/Desktop/work/Alpha/eat.jpeg","/Users/gaopeiwen/Desktop/work/Alpha/eat_1.jpeg");
//        copyFile("/Users/gaopeiwen/Desktop/work/Alpha/IODemo1.java", "/Users/gaopeiwen/Desktop/work/Alpha/IODemo1_1.java");
        copyTextFile("/Users/gaopeiwen/Desktop/work/Alpha/IODemo1.java","/Users/gaopeiwen/Desktop/work/Alpha/IODemo1_2.java");
    }

    public static void copyFile(String srcFilePath, String destFilePath) {
        try (
                FileInputStream fis = new FileInputStream(srcFilePath);
                FileOutputStream fos = new FileOutputStream(destFilePath);
        ) {
            byte[] bytes = new byte[128];
            int len = 0; // 实际读取的字节数
            while ((len = fis.read(bytes, 0, 128)) > 0) {
                fos.write(bytes, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyTextFile(String srcFilePath, String destFilePath) {
        try (
                FileReader fr = new FileReader(srcFilePath);
                FileWriter fw = new FileWriter(destFilePath);
        ) {
            char[] chars = new char[128];
            int len = 0; // 实际读取的字符数
            while ((len = fr.read(chars, 0, 128)) > 0) {
//                System.out.print(String.valueOf(chars, 0, len));
                fw.write(chars, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
