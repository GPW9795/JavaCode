package com.newcoder.chapter2.part19;

public class Airplane extends Vehicle {

    @Override
    public void run() {
        System.out.println(brand + "飞的真快");
    }

    @Override
    public Airplane myself() {
        return this;
    }
}
