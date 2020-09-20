package com.newcoder.part12;

// 赛车手
public class Driver {

    String name;
    int age;
    String sex;

    // 自我介绍
    void introduce() {
        System.out.println("我叫" + name);
        System.out.println("我今年" + age);
        System.out.println("我是" + sex);
    }

    // 驾驶赛车
    void drive(Car car) {
        System.out.println(name + "驾驶" + car.color + car.brand);
        car.run();
    }

}
