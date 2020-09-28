package com.nowcoder.chapter3.part40;

import java.lang.management.BufferPoolMXBean;
import java.nio.Buffer;
import java.nio.CharBuffer;

/**
 * Buffer
 */
public class NIODemo1 {

    public static void main(String[] args) {
        // 创建对象
        CharBuffer buffer = CharBuffer.allocate(8);
        printBufferStatus(buffer, "创建");

        // 放入数据
        buffer.put('A').put('B').put('C');
        printBufferStatus(buffer, "放入");

        // 准备取出
        buffer.flip();
        printBufferStatus(buffer, "准备");

        // 取出数据
        System.out.println("###:\t" + buffer.get() + buffer.get());
        printBufferStatus(buffer, "取出");

        // 重置指针
        buffer.clear();
        printBufferStatus(buffer, "重置");

        // 绝对位置
        System.out.println("###:" + "\t" + buffer.get(0) + buffer.get(1));
        printBufferStatus(buffer, "绝对");
    }

    public static void printBufferStatus(Buffer buffer, String action) {
        System.out.println(
                new StringBuilder()
                        .append(action).append(":\t")
                        .append("position=").append(buffer.position())
                        .append(", limit=").append(buffer.limit())
                        .append(", capacity=").append(buffer.capacity()).toString()
        );
    }
}
