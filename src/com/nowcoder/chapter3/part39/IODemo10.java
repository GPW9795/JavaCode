package com.nowcoder.chapter3.part39;

import java.io.*;

/**
 * 序列化
 */
public class IODemo10 {

    public static void main(String[] args) {
//        testSerialize();
        testDeserialize();
    }

    public static void testSerialize() {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream("C:/javacode/car.txt"));
        ) {
            oos.writeObject(new Car("奔驰", "红色", 300));
            oos.writeObject(new Car("宝马", "蓝色", 400));
            oos.writeObject(new Car("宾利", "黑色", 500));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testDeserialize() {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/javacode/car.txt"));
        ) {
            System.out.println(ois.readObject());
            System.out.println(ois.readObject());
            System.out.println(ois.readObject());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Car implements Serializable {
    private String brand;
    private String color;
    private int maxSpeed;

    public Car(String brand, String color, int maxSpeed) {
        System.out.println("Init Car");
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

}
