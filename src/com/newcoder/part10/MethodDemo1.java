package com.newcoder.part10;

/*方法*/
public class MethodDemo1 {

    public static void main(String[] args) {
        sayHello();

        printName("gpw");

        int n = randomInt();
        System.out.println(n);

        long m = power(2, 10);
        System.out.println(m);

        introduce("gpw");
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void printName(String name) {
        System.out.println("My name is " + name + ".");
    }

    public static int randomInt() {
        return (int) (Math.random() * 10);
    }

    public static long power(int x, int y) {
        return (long) Math.pow(x, y);
    }

    public static void introduce(String name) {
        if (name == null || name.equals("")) {
            return; // 没有返回值依然可以return，仅表示方法结束
        }

        sayHello();
        printName(name);
        System.out.println("My lucky number is " + randomInt() + ".");
    }
}
