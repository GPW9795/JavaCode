package com.newcoder.part15;

public class Game {

    public static void main(String[] args) {
        Driver d = new Driver();

        Car c = new Car();
        d.drive(c);

        Truck t = new Truck();
        d.drive(t);
    }
}
