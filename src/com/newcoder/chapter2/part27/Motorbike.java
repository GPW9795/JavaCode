package com.newcoder.chapter2.part27;

// 若子类不是抽象的，它必须事先父类的抽象方法
public class Motorbike extends Vehicle {

    public Motorbike() {
        super();
    }

    @Override
    public void startup() {
        System.out.println("脚踹启动！！");
    }
}
