package com.newcoder.part10;

/*方法递归*/
public class MethodDemo5 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(6));
    }

    // 阶乘 n! = n * (n -1)!
    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // 斐波那契数列
    // 1, 1, 2, 3, 5, 8, 13, 21...
    // f(1) = 1, f(2) = 1, f(x) = f(x-2) + f(x-1)
    public static long fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        // f(n-2) + f(n-3), f(n-4) + f(n-3),重复计算f(n-3),效率并不高
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
