package com.newcoder.chapter2.part29;

import com.newcoder.chapter2.part29.sub.Boat;
import com.newcoder.chapter2.part29.sub.Car;
import com.newcoder.chapter2.part29.sub.Motorbike;

// 接口应用实例
public class Game {

    public static void main(String[] args) {

        Boat b = new Boat();
        Car c = new Car();
        Motorbike m = new Motorbike();

        Driver d = new Driver();
        d.drive(b);
        d.drive(c);
        d.drive(m);

        d.live(b);
        d.live(c);
//        d.live(m);
    }
}
