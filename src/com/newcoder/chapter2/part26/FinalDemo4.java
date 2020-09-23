package com.newcoder.chapter2.part26;

import java.util.Arrays;

/*final修饰引用类型变量*/
public class FinalDemo4 {

    public static void main(String[] args) {
        final int[] nums = {3,1,5,7};
        System.out.println(Arrays.toString(nums));

        nums[0] = 6;
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

//        nums = null;
//        nums = new int[] {1,2,4,5,7};
        final Car c = new Car("奔驰");
        System.out.println(c.getBrand());

        c.setBrand("宝马");
        System.out.println(c.getBrand());

//        c = null;
//        c = new Car("奥迪");
    }
}

class Car{
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