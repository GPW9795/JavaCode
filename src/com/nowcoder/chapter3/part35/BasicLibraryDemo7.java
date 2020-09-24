package com.nowcoder.chapter3.part35;

import java.util.Arrays;

/**
 * String常用API
 */
public class BasicLibraryDemo7 {

    public static void main(String[] args) {
        String str = "Hello World, Hello 牛客.";
        System.out.println(str.charAt(6));

        System.out.println(str.substring(6));
        System.out.println(str.substring(6, 11));

        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(Arrays.toString(str.split(",")));

        System.out.println(str.indexOf("Hello"));
        System.out.println(str.lastIndexOf("Hello"));

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println(str.replaceFirst("Hello", "Hi"));
        System.out.println(str.replaceAll("Hello", "Hi"));

        System.out.println(str);

        str = "   Hello   ";
        System.out.println(str);
        System.out.println(str.trim());
    }

}
