package com.nowcoder.chapter3.part35;

import java.util.Random;

/**
 * Random
 *
 * @see java.util.Random
 */
public class BasicLibraryDemo12 {

    public static void main(String[] args) {
        Random ran = new Random();
        System.out.println(ran.nextBoolean());
        System.out.println(ran.nextDouble());
        System.out.println(ran.nextInt());
        System.out.println(ran.nextInt(100));

        Random ran1 = new Random(9);
        System.out.println(ran1.nextInt(100));
        System.out.println(ran1.nextInt(200));

        Random ran2 = new Random(9);
        System.out.println(ran2.nextInt(200));
        System.out.println(ran2.nextInt(100));
    }

}

