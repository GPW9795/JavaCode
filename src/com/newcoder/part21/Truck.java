package com.newcoder.part21;

public class Truck extends Vehicle {

    int capacity;

    @Override
    void run() {
        System.out.println("Truck run:" + super.brand);
    }

    void unload() {
        System.out.println("Truck unload:" + this.capacity);
    }
}
