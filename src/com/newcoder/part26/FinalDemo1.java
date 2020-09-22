package com.newcoder.part26;

/*
 *final修饰类和方法
 * */
public final class FinalDemo1 {

}

//class FinalDemoX extends FinalDemo1

class Person {

    public void sayHello() {
        System.out.println("Hello!");
    }

    public final void sayGoodbye(){
        System.out.println("Goodbye!");
    }
}

class Driver extends Person{
    @Override
    public void sayHello() {
        super.sayHello();
    }

//    public void sayGoodbye(){
//
//    }
}