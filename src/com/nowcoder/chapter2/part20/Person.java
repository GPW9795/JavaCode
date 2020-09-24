package com.nowcoder.chapter2.part20;

public class Person {

    String name;

    public Person(){
        System.out.println("Init Person");
    }

    public Person(String name){
        this.name = name;
        System.out.println("Init Person with name");
    }
}
