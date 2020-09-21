package com.newcoder.part20;

public class Driver extends Person{

    public Driver(){
        System.out.println("Init driver");
    }

    public Driver(String name){
        super(name);
        System.out.println("Init driver with name");
    }
}
