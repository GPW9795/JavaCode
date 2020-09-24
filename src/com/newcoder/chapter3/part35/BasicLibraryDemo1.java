package com.newcoder.chapter3.part35;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * 系统相关类
 */
public class BasicLibraryDemo1 {

    public static void main(String[] args) throws IOException {
        // 如何获取系统所有的环境变量
        Map<String, String> map = System.getenv();
        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

        // 根据名称获取环境变量的值
        System.out.println("Path：" + System.getenv("Path"));

        // 获取所有的系统属性
        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            System.out.println(key + ": " + properties.get(key));
        }

        // 根据名称获取系统的属性值
        System.out.println("user.name: " + System.getProperty("user.name"));

        // 返回JVM可用的CPU的数量
        System.out.println(Runtime.getRuntime().availableProcessors());
        // 返回JVM中的内存总量
        System.out.println(Runtime.getRuntime().totalMemory());
        // 返回JVM中的可用内存
        System.out.println(Runtime.getRuntime().freeMemory());
        // 返回JVM可以使用的内存总数
        System.out.println(Runtime.getRuntime().maxMemory());
        // 返回JRE的版本
        System.out.println(Runtime.version().toString());
        // 在单独的进程里执行系统的命令
//        Runtime.getRuntime().exec("shutdown -s -t 60");
    }

}
