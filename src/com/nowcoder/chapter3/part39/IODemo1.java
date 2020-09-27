package com.nowcoder.chapter3.part39;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * File
 */
public class IODemo1 {

    public static void main(String[] args) throws IOException {
        File file = null;

        // 创建
        file = new File("/Users/gaopeiwen/Desktop/work/Alpha/1.txt");
        file.createNewFile();

        // 删除
//        file.delete();

        // 改名
//        file.renameTo(new File("/Users/gaopeiwen/Desktop/work/Alpha/2.txt"));

        // 判断
        System.out.println("是否存在：" + file.exists());
        System.out.println("是否文件：" + file.isFile());
        System.out.println("是否可读：" + file.canRead());
        System.out.println("是否可写：" + file.canWrite());
        System.out.println("绝对路径：" + file.isAbsolute());

        // 访问
        System.out.println("文件名称：" + file.getName());
        System.out.println("文件路径：" + file.getPath());
        System.out.println("绝对路径：" + file.getAbsolutePath());
        System.out.println("上级目录：" + file.getParent());
        System.out.println("文件长度：" + file.length());
        System.out.println("修改时间：" + file.lastModified());

        // 目录操作
        file = new File("/Users/gaopeiwen/Desktop/work/Alpha/a");
        file.mkdir();

        System.out.println(Arrays.toString(file.listFiles()));
        System.out.println(Arrays.toString(file.getParentFile().listFiles()));

        // 相对路径, 相对于项目的位置
        file = new File("abc.txt");
        file.createNewFile();

        System.out.println("文件路径：" + file.getPath());
        System.out.println("绝对路径：" + file.getAbsolutePath());
        System.out.println("上级目录：" + file.getAbsoluteFile().getParent());
    }
}
