package com.newcoder.part27;

// 若子类不是抽象的，它必须事先父类的抽象方法
public class Car extends Vehicle {

    public Car() {
        super();
    }

    @Override
    public void startup() {
        System.out.println("钥匙启动");
    }
}
