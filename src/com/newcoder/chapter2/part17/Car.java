package com.newcoder.chapter2.part17;


public class Car {
    String brand;
    String color;
    int maxSpeed;

    public Car(String brand, String color, int maxSpeed){
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void run(){
        System.out.println("brand:" + brand);
        System.out.println("color:" + color);
        System.out.println("maxSpeed:" + maxSpeed);
    }
}
