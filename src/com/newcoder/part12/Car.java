package com.newcoder.part12;

public class Car {

    String brand;
    String color;
    int maxSpeed;

    // 行驶
    void run() {
        // 方法内声明的变量为局部变量
        System.out.println(color + brand + "时速" + maxSpeed);
        startup();
        speedUp();
        stop();
    }

    // 启动
    void startup(){
        System.out.println(brand+"启动");
    }

    // 加速
    void speedUp(){
        System.out.println(brand+"加速");
    }
    // 刹车
    void stop(){
        System.out.println(brand+"刹车");
    }
}
