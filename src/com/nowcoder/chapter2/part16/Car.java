package com.nowcoder.chapter2.part16;

public class Car {
    String brand;
    String color;
    int maxSpeed;

    public Car(String b) {
        brand = b;
    }

    public Car(String b, String c) {
        brand = b;
        color = c;
    }

    public Car(String b, String c, int s) {
        brand = b;
        color = c;
        maxSpeed = s;
    }

    void run() {
        System.out.println("brand:" + brand);
        System.out.println("color:" + color);
        System.out.println("maxSpeed:" + maxSpeed);
    }
}
