package com.nowcoder.chapter3.part35;

/**
 * StringBuilder
 */
public class BasicLibraryDemo8 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());

        sb.append("Hello").append(" World,").append(" Hello").append(" 牛客.");
        System.out.println(sb.toString());
        System.out.println(sb.capacity());

        sb.insert(12, " Hello China,");
        System.out.println(sb.toString());
        System.out.println(sb.capacity());

        sb.delete(0, 13); // < 13
        System.out.println(sb.toString());
        System.out.println(sb.capacity()); // 删除掉之后容量不变

        // 习惯的格式
        StringBuilder builder =
                new StringBuilder()
                        .append("Hello World, ")
                        .append("Hello China, ")
                        .append("Hello 牛客.");
        System.out.println(builder.toString());
    }

}
