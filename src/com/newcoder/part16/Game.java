package com.newcoder.part16;

/*构造方法重载*/
public class Game {

    public static void main(String[] args) {
        Car c1 = new Car("奔驰");
        c1.run();
        System.out.println();

        Car c2 = new Car("宝马", "蓝色");
        c2.run();
        System.out.println();

        Car c3 = new Car("宾利", "红色", 160);
        c3.run();
        System.out.println();
    }
}
