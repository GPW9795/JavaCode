package com.newcoder.part20;

public class Car extends Vehicle{

    @Override
    void run() {
        super.run();
        System.out.println("小车车RUNNING");
    }
}
