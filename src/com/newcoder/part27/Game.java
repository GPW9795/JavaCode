package com.newcoder.part27;

/*抽象类*/
public class Game {

    public static void main(String[] args) {
        Car car = new Car();
        car.run();

        Motorbike motorbike = new Motorbike();
        motorbike.run();

        // 抽象类不能实例化
//        Vehicle vehicle = new Vehicle();

//        Airplane airplane = new Airplane();
    }
}
