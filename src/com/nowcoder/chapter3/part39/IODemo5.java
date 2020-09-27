package com.nowcoder.chapter3.part39;

import java.io.*;

/**
 * 缓冲流
 */
public class IODemo5 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        copyFile("/Users/gaopeiwen/Desktop/work/Alpha/me.jpeg", "/Users/gaopeiwen/Desktop/work/Alpha/me_1.jpeg");
        long end = System.currentTimeMillis();
        System.out.println("一共用时：" + (end - start));
    }

    public static void copyFile(String srcFilePath, String destFilePath) {
        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFilePath));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
//                FileInputStream fis = new FileInputStream(srcFilePath);
//                FileOutputStream fos = new FileOutputStream(destFilePath);
        ) {
            byte[] bytes = new byte[128];
            int len = 0;
            while ((len = bis.read(bytes, 0, 128)) > 0) {
                bos.write(bytes, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
