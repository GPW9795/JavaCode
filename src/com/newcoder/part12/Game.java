package com.newcoder.part12;

/*成员方法详解*/
public class Game {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "奔驰";
        c1.color = "红色";
        c1.maxSpeed = 500;
        c1.run();

        Car c2 = new Car();
        c2.brand = "宝马";
        c2.color = "蓝色";
        c2.maxSpeed = 400;
        c2.run();

        Driver d = new Driver();
        d.name = "gpw";
        d.age = 23;
        d.sex = "女";
        d.introduce();
        d.drive(c1);
        d.drive(c2);
    }
}
