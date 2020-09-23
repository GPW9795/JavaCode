package com.newcoder.chapter2.part22;

import com.newcoder.chapter2.part22.p1.Car;
import com.newcoder.chapter2.part22.p2.*;

/*包*/
public class Game {

    public static void main(String[] args) {
        // 完整限定名
        com.newcoder.chapter2.part22.p1.Bus bus = new com.newcoder.chapter2.part22.p1.Bus();

        // import 包名.类名
        Car car = new Car();

        // import 包名.*
        Motorbike motorbike = new Motorbike();
        Truck truck = new Truck();

        // 冲突的时候
        com.newcoder.chapter2.part22.p3.Driver driver = new com.newcoder.chapter2.part22.p3.Driver();

    }
}
