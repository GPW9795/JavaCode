package com.nowcoder.chapter3.part40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/**
 * Charset
 */
public class NIODemo3 {

    public static Charset charset = Charset.forName("UTF-8");
    public static CharsetEncoder encoder = charset.newEncoder();
    public static CharsetDecoder decoder = charset.newDecoder();

    public static void main(String[] args) {
//        testEncoder();
        testDecoder();
    }

    public static void testEncoder() {
        try (
                FileChannel channel = new FileOutputStream("C:/javacode/nio.txt").getChannel();
        ) {
            // 字符缓冲
            CharBuffer charBuffer = CharBuffer.allocate(1024);
            charBuffer.put("白日依山尽，\n").put("黄河入海流。\n").put("欲穷千里目，\n").put("更上一层楼。\n");
            charBuffer.flip();
            // 字节缓冲
            ByteBuffer byteBuffer = encoder.encode(charBuffer);
            channel.write(byteBuffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testDecoder() {
        try (
                FileChannel channel = new FileInputStream("C:/javacode/nio.txt").getChannel();
        ) {
            ByteBuffer byteBuffer = channel.map(FileChannel.MapMode.READ_ONLY,0,channel.size());
            CharBuffer charBuffer = decoder.decode(byteBuffer);
            System.out.println(charBuffer.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
