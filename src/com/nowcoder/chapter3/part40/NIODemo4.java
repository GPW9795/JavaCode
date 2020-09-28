package com.nowcoder.chapter3.part40;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Consumer;

/**
 * Paths & Files
 */
public class NIODemo4 {

    public static void main(String[] args) throws IOException {
        testPaths();
        testFiles();
    }

    public static void testPaths() {
        Path path = Paths.get("abc.txt").toAbsolutePath();
        System.out.println(path);
        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.getNameCount());
        System.out.println(path.getName(0));
        System.out.println(path.getFileName());
    }

    public static void testFiles() throws IOException {
        // 复制文件
        Files.copy(Paths.get("C:/javacode/nio.txt"),
                new FileOutputStream("C:/javacode/nio_1.txt"));
        // 读取文件
        List<String> lines = Files.readAllLines(Paths.get("C:/javacode/nio.txt"));
        System.out.println(lines);
        // 写入文件
        Files.write(Paths.get("C:/javacode/files.txt"), lines);
        // 逐一列举
        Files.list(Paths.get("C:/javacode"))
                .forEach(new Consumer<Path>() {
                    @Override
                    public void accept(Path path) {
                        System.out.println(path);
                    }
                });
        // 逐行处理
        Files.lines(Paths.get("C:/javacode/nio.txt"))
        .forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
