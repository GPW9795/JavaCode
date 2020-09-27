package com.nowcoder.chapter3.part39;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 过滤文件
 */
public class IODemo2 {

    public static void main(String[] args) throws IOException {
        File dir = new File("/Users/gaopeiwen/Desktop/work/Alpha");

        File[] files = dir.listFiles();

        files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
//                System.out.println(pathname);
                if (pathname.getName().endsWith(".txt")){
                    return true;
                }
                return false;
            }
        });

        files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                System.out.println(dir.getName() + ", " + name);
                if (name.endsWith(".txt")){
                    return true;
                }
                return false;
            }
        });

        System.out.println(Arrays.toString(files));
    }
}
