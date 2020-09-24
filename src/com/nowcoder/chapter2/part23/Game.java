package com.nowcoder.chapter2.part23;

import com.nowcoder.chapter2.part23.p1.*;
import com.nowcoder.chapter2.part23.p2.Vehicle;

/*访问修饰符*/
public class Game {

    public static void main(String[] args) {

        Bus bus = new Bus();
//        Car car = new Car();

        Vehicle vehicle = new Vehicle();
        vehicle.run();
    }
}