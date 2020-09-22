package com.newcoder.chapter1.part04;

public class OperatorDemo {

    public static void main(String[] args) {
        // 1.算术运算符
        System.out.println(5 / 2);
        System.out.println(5 % 2);

        // ++i, i++
        int i  = 10;
        ++i;
        System.out.println(i);
        i++;
        System.out.println(i);

        // ++a 先自增后运算
        int a = 100;
        System.out.println(++a + 100);
        System.out.println(a);

        // b++ 先运算后自增
        int b = 100;
        System.out.println(b++ + 100);
        System.out.println(b);

        // 2.关系运算符
        int score = 70;
        System.out.println(score >= 60);
        System.out.println(score == 100);
        System.out.println(score != 100);

        // 3.逻辑运算符
        int age = 32;
        double salary = 40000.00;

        boolean result = age < 30 && salary > 20000.00;
        System.out.println(result);

        result = age < 30 || salary > 20000.00;
        System.out.println(result);

        result = !(age < 30 || salary > 20000.00);
        System.out.println(result);

        // &&, || 存在短路现象
        System.out.println(salary > 50000.00 && ++age < 30);
        System.out.println(age);// ++age没执行

        System.out.println(salary > 30000.00 || ++age < 30);
        System.out.println(age);

        // 4.赋值运算符
        salary += 10000.00;
        System.out.println(salary);

        double topSalary = salary += 10000.00;
        System.out.println(salary);
        System.out.println(topSalary);

        salary += 10000.00;
        System.out.println(salary);

        // 5.三元运算符
        String title = age > 30 ? "小姐姐" : "小美眉";
        System.out.println(title);

        salary = salary > 50000.00 ? 50000.00 : salary;
        System.out.println(salary);

        // 6.字符串运算符
        String s1 = "她的年龄：" + age;
        System.out.println(s1);

        String s2 = "她的工资：" + salary;
        System.out.println(s2);

        System.out.println("" + 100 + 200);
        System.out.println(100 + 200 + "");

        // 7.位运算符
        System.out.println(0b1010);
        System.out.println(012);
        System.out.println(0xA);

        // 如何将十进制转换为二进制
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(9));
        System.out.println(Integer.toBinaryString(-5));

        // 按位逻辑运算
        System.out.println(5 & 9);
        System.out.println(5 | 9);
        System.out.println(5 ^ 9);
        System.out.println(~-5);

        // 移位运算
        System.out.println(5 << 2);
        System.out.println(-5 << 2);
        System.out.println(-5 >> 2);
        System.out.println(-5 >>> 2);
    }
}
