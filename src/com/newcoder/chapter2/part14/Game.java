package com.newcoder.chapter2.part14;

/*构造方法*/
public class Game {

    public static void main(String[] args) {
        Truck t1 = new Truck("解放", "绿色", 100);
        t1.run();

        Truck t2 = new Truck("福田", "黑色", 120);
        t2.run();

        Car c1 = new Car();
        c1.run();

        Car c2 = new Car();
        c2.run();
    }
}
