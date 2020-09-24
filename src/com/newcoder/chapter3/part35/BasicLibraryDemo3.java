package com.newcoder.chapter3.part35;

/**
 * Object类
 */
public class BasicLibraryDemo3 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Object obj = new Object();
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        System.out.println(obj.getClass());
        System.out.println(obj.equals(new Object()));

        Driver d1 = new Driver("GPW");
        Driver d2 = d1.clone();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1.equals(d2));
        System.out.println(d1.getCar());
        System.out.println(d2.getCar());
        System.out.println(d2.getCar() == d2.getCar());
    }

}

class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

class Driver implements Cloneable {

    private String name;
    private Car car;

    public Driver(String name) {
        this.name = name;
        this.car = new Car("奔驰");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return this.name + "," + this.car.getBrand();
    }

    @Override
    protected Driver clone() throws CloneNotSupportedException {
        return (Driver) super.clone();
    }
}