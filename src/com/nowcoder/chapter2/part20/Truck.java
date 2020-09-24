package com.nowcoder.chapter2.part20;

public class Truck extends Vehicle{

    int maxSpeed = 600;

    public Truck(){
        // 必须放在第一行
        super();
        System.out.println("Init Truck");
    }

    @Override
    void run() {
        super.run();
        System.out.println("Truck Running");

        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
    }
}
