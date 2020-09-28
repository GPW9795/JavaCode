package com.nowcoder.chapter3.part40;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Channel
 */
public class NIODemo2 {

    public static void main(String[] args) {
        copyFile("C:/javacode/me.jpg", "C:/javacode/me2.jpg");
        appendFile("C:/javacode/1.txt", "\n欲穷千里目，\n更上一层楼。\n");
    }

    public static void copyFile(String srcFilePath, String destFilePath) {
        try (
                FileChannel in = new FileInputStream(srcFilePath).getChannel();
                FileChannel out = new FileOutputStream(destFilePath).getChannel();
        ) {
            // 整体映射
//            ByteBuffer buffer = in.map(FileChannel.MapMode.READ_ONLY, 0, in.size());
//            out.write(buffer);
            // 批次映射
            ByteBuffer buffer = ByteBuffer.allocate(1024 * 100); // 100KB
            while (in.read(buffer) != -1){
                buffer.flip();
                out.write(buffer);
                buffer.clear();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendFile(String filePath, String content){
        try (
                FileChannel channel =
                        new RandomAccessFile(filePath, "rw").getChannel();
        ) {
            // 定位至文件末尾
            channel.position(channel.size());
            // 创建Buffer
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put(content.getBytes());
            buffer.flip();
            channel.write(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
