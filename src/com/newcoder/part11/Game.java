package com.newcoder.part11;

// 游戏
public class Game {

    public static void main(String[] args) {
        // 创建一个赛车
        Car c = new Car();
        // 访问成员变量
        c.brand = "奔驰";
        c.color = "红色";
        System.out.println(c.brand);
        System.out.println(c.color);
        System.out.println(c.maxSpeed);
        // 访问成员方法
        c.run();

        // 再创建一个赛车
        Car r = new Car();
        r.brand = "宝马";
        r.color = "蓝色";
        System.out.println(r.brand);
        System.out.println(r.color);
        System.out.println(r.maxSpeed);
        r.run();

        // 直接打印赛车对象,后面是地址
        System.out.println(c);
        System.out.println(r);
    }
}
