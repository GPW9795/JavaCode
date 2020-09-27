package com.nowcoder.chapter3.part39;

import java.io.*;

/**
 * RandomAccessFile
 */
public class IODemo9 {

    public static void main(String[] args) {
        try (
                RandomAccessFile raf = new RandomAccessFile("/Users/gaopeiwen/Desktop/work/Alpha/out.txt", "rw");
        ) {
            // 定位至文件末尾
            raf.seek(raf.length());
            raf.write("\n".getBytes());
            raf.write("欲穷千里目，\n".getBytes());
            raf.write("更上一层楼。\n".getBytes());
            // 定位到开头
            raf.seek(0);
            String line = null;
            while ((line = raf.readLine()) != null) {
                // String -> bytes (UTF-8)
                // bytes -> String (ISO8859-1)
                // String -> bytes (ISO8859-1)
                // bytes -> String (UTF-8)
                byte[] bytes = line.getBytes("ISO8859-1");
                line = new String (bytes,"UTF-8");
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
