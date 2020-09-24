package com.nowcoder.chapter2.part18;

/*封装*/
public class Game {

    public static void main(String[] args) {

        Driver d = new Driver("gpw",-10);
        System.out.println(d.getName());
        System.out.println(d.getAge());

        d.setAge(-20);
        System.out.println(d.getAge());

        d.setAge(20);
        System.out.println(d.getAge());

        d.setName("John");
        System.out.println(d.getName());

    }
}
