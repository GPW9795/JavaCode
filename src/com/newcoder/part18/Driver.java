package com.newcoder.part18;

import javax.print.DocFlavor;

public class Driver {

    private String name;
    private int age;

    public Driver(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    // 公有的set方法用于赋值
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else if (age > 200) {
            this.age = 200;
        } else {
            this.age = age;
        }
    }

    // 公有的get方法用于取值
    public int getAge() {
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
