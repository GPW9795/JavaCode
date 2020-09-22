package com.newcoder.chapter2.part20;

/*
 * 1、super关键字
 * 2、super关键字的应用
 * 3、super关键字补充
 * */
public class Game {

    public static void main(String[] args) {
        Car c = new Car();
        c.run();

        Truck t = new Truck();
        t.run();

        Driver d1 = new Driver();
        Driver d2 = new Driver("gpw");
    }
}
