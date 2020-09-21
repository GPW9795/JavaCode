package com.newcoder.part14;

public class Car {

    long engineNo;

    public Car() {
        // 生成发动机号（时间毫秒数）
        engineNo = System.currentTimeMillis();
    }

    void run() {
        System.out.println("发动机编号：" + engineNo);
    }
}
