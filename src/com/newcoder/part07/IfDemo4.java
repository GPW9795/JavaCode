package com.newcoder.part07;

/* if语句的注意事项 */
public class IfDemo4 {

    public static void main(String[] args) {
        int score = 85;

        // 当某一分支只含一行代码时可以省略{}，不建议这样做
        if (score >= 90)
            System.out.println("A");
        else if (score >= 80)
            System.out.println("B");
        else if (score >= 70)
            System.out.println("C");
        else if (score >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
