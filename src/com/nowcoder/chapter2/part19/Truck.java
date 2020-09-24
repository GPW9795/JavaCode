package com.nowcoder.chapter2.part19;

public class Truck extends Vehicle {

    int capacity;

    void unload() {
        System.out.println(brand + "已经卸货" + capacity + "T");
        capacity = 0;
    }
}
