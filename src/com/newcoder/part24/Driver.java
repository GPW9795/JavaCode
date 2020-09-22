package com.newcoder.part24;

public class Driver {

    private long licenseNo;
    private String name;
    private int age = 18;

    //
    {
        System.out.println("Init licenseNo");
        licenseNo = System.currentTimeMillis();
    }

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public long getLicenseNo() {
        return licenseNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduce() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("LicenseNo: " + this.licenseNo);
    }
}
