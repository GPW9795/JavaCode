package com.nowcoder.chapter2.part33;

import java.util.Arrays;

// 引用类型数组
public class ReferenceArrayDemo {

    public static void main(String[] args) {
        Car[] cars = {
                new Car("奔驰"),
                new Car("宝马"),
                new Car("奥迪"),
        };

        for (Car car : cars) {
            car.run();
        }

        System.out.println(Arrays.toString(cars));

        Driver[] drivers = new Driver[3];
        drivers[0] = new Driver("gpw");
        drivers[1] = new Driver("cbx");
        drivers[2] = new Driver("zxm");

        for (Driver driver : drivers) {
            driver.introduce();
        }
    }

}

class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public void run() {
        System.out.println(this.brand);
    }
}

class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println(this.name);
    }
}
