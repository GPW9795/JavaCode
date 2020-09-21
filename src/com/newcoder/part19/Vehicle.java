package com.newcoder.part19;

public class Vehicle {

    String brand;

    void run() {
        System.out.println(brand + "!!!");
    }

    Vehicle myself(){
        return this;
    }

}
