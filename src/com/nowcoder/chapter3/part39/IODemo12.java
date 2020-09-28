package com.nowcoder.chapter3.part39;

import java.io.*;

/**
 * 序列化的版本
 */
public class IODemo12 {

    public static void main(String[] args) {
//        testSerialize();
        testDeserialize();
    }

    public static void testSerialize() {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream("C:/javacode/dri.txt"));
        ) {
            Driver d = new Driver("gpw", 'F', 23);
//            d.setLicense("G1234");
//            d.setLevel(5);
            oos.writeObject(d);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testDeserialize() {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/javacode/dri.txt"));
        ) {
            Driver d = (Driver) ois.readObject();
            System.out.println(d);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Driver implements Serializable {

    private static final long serialVersionUID = 6563216815765085174L;
    private String name;
    private char gender;
    private int age;
    private String licenseNo;
    //    private int level;
    private int order;

    public Driver(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", licenseNo='" + licenseNo + '\'' +
                ", order=" + order +
                '}';
    }
}
