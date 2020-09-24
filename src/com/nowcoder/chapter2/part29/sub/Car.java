package com.nowcoder.chapter2.part29.sub;

import com.nowcoder.chapter2.part29.Residence;
import com.nowcoder.chapter2.part29.Vehicle;

public class Car extends Vehicle implements Residence {

    @Override
    public void cover() {
        System.out.println("住车上");
    }
}
