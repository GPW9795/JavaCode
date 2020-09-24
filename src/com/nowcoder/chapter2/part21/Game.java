package com.nowcoder.chapter2.part21;

public class Game {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.brand = "benz";

        Bus b = new Bus();
        b.brand = "bus benz";
        b.passengers = 50;

        Truck t = new Truck();
        t.brand = "truck benz";
        t.capacity = 100;

        Driver d = new Driver();
        d.drive(v);
        System.out.println();
        d.drive(b);
        System.out.println();
        d.drive(t);
        System.out.println();

        // 默认向上转型
        Vehicle vehicle = new Bus();
        // 强制类型转换
        Bus bus = (Bus) vehicle;
        // Truck truck = (Truck) vehicle;
    }
}
