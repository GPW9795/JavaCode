package com.nowcoder.chapter3.part39;

import java.io.File;
import java.io.IOException;

/**
 * 遍历文件
 */
public class IODemo3 {

    public static void main(String[] args) throws IOException {
        printFile("/Users/gaopeiwen/Desktop/javademo",0);
    }

    /*
     * Alpha
     *   a
     *     - x.png
     *     - y.png
     *   - 1.txt
     *   - 2.txt
     *
     */
    public static void printFile(String filePath, int depth) {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new IllegalArgumentException("文件不存在!");
        }
        // 打印空格
        for (int i = 0; i < depth; i++) {
            System.out.print(" ");
        }
        // 打印名字
        if(file.isFile()){
            System.out.print("- ");
        }
        System.out.println(file.getName());
        // 目录递归
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File f: files){
                printFile(f.getPath(), depth+2);
            }
        }
    }
}
