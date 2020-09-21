package com.newcoder.part14;

public class Truck {

    String brand;
    String color;
    int capacity;

    public Truck(String b, String c, int p) {
        brand = b;
        color = c;
        capacity = p;
    }

    void run() {
        System.out.println(color + brand + "载重" + capacity + "吨");
    }
}
