package com.nowcoder.chapter2.part25;

import java.util.Arrays;

/*
* static关键字
* */
public class Game {

    public static void main(String[] args) {
        Policeman p1 = new Policeman("GPW");
        p1.chase();

        Policeman p2 = new Policeman("CBX");
        p2.chase();

//        System.out.println(Arrays.toString(p1.image));
//        System.out.println(Arrays.toString(p2.image));
        System.out.println(Arrays.toString(Policeman.image));

//        System.out.println(p1.getOath());
//        System.out.println(p2.getOath());
        System.out.println(Policeman.getOath());
    }

}
