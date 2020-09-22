package com.newcoder.part32;

// 枚举类
public class EnumDemo {

    public static void main(String[] args) {
        printSeasonWord(Season.SUMMER);
        for (Season value : Season.values()){
            System.out.println(value);
        }

        System.out.println(Direction.SOUTH.getName());
        System.out.println(Direction.NORTH.getName());

        Gender.MALE.print();
        Gender.FEMALE.print();

        Status.ON.print();
        Status.OFF.print();
    }

    public static void printSeasonWord(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("万物复苏");
                break;
            case SUMMER:
                System.out.println("花团锦簇");
                break;
            case FALL:
                System.out.println("硕果累累");
                break;
            case WINTER:
                System.out.println("白雪皑皑");
                break;
        }
    }

}
