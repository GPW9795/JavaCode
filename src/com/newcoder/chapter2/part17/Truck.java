package com.newcoder.chapter2.part17;

public class Truck {

    String brand;
    String color;
    int capacity;

    public Truck(String brand) {
        this.brand = brand;
    }

    public Truck(String brand, String color) {
        // 必须放在第一行
        this(brand);
        this.color = color;
    }

    public Truck(String brand, String color, int capacity) {
        // 必须放在第一行
        this(brand, color);
        this.capacity = capacity;
    }

    // 启动
    void startup(){
        System.out.println("启动");
    }

    // 加速
    void speedUp(){
        System.out.println("加速");
    }
    // 刹车
    void stop(){
        System.out.println("刹车");
    }

    // 行驶
    void run() {
        // 名称不冲突时可以省略this
        System.out.println("brand:" + this.brand);
        System.out.println("color:" + this.color);
        System.out.println("capacity:" + this.capacity);

        this.startup();
        this.speedUp();
        this.stop();
    }
}
