package com.newcoder.chapter2.part19;

/*1、继承
 *2、重写*/
public class Game {

    public static void main(String[] args) {
        Bus b = new Bus();
        b.brand = "HHH";
        b.passengers = 50;
        b.run();
        b.brush();

        Truck t = new Truck();
        t.brand = "UUU";
        t.capacity = 80;
        t.run();
        t.unload();

        Airplane a = new Airplane();
        a.brand = "波音747";
        a.run();
        System.out.println(a.myself());
    }
}
