package com.newcoder.chapter2.part17;

/*
1、this关键字
2、this关键字的应用
*/
public class Game {

    public static void main(String[] args) {
        Car c = new Car("奔驰", "蓝色", 120);
        c.run();

        Truck t = new Truck("解放", "green", 100);
        t.run();

        Bus b1 = new Bus("红色");
        b1.run();

        Bus b2 = new Bus("蓝色");
         b2.run();

    }
}
