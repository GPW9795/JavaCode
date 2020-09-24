package com.nowcoder.chapter2.part27;

// 抽象类中可以没有抽象方法
public abstract class Vehicle {

    public Vehicle() {
        System.out.println("Init Vehicle.");
    }

    // 包含抽象方法的类必须定义为抽象类
    public abstract void startup();

    public void speedup(){
        System.out.println("SPEED UP!!!");
    }

    public void stop(){
        System.out.println("STOP!!!");
    }

    // 模板模式，某些环节推迟到子类去实现
    public void run(){
        startup();
        speedup();
        stop();
    }
}
