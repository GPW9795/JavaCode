package com.nowcoder.chapter2.part13;

public class Game {

    public static void main(String[] args) {
        Driver d = new Driver();

        double money = 8000.0;
        d.earn(money);
        System.out.println("发放" + money + "元");

        Car c = new Car();
        c.color = "红色";
        d.refit(c);
        System.out.println("颜色" + c.color);

        int n = d.lucky();
        System.out.println("幸运数字" + n);
    }
}
