package com.nowcoder.chapter2.part13;

// 赛车手
public class Driver {

    void earn(double money) {
        money /= 2;
        System.out.println("收入" + money + "元");
    }

    void refit(Car c) {
        c.color = "蓝色";
    }

    int lucky() {
        int k = (int) (Math.random() * 100);
        return k;
    }

}
