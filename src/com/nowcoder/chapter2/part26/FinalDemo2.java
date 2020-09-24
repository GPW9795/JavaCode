package com.nowcoder.chapter2.part26;

/*
 *final修饰成员变量
 * */
public class FinalDemo2 {

    public static final int a = 1;
    public static final int b;

    public final double i = 1.0;
    public final double j;
    public final double k;

    static {
        b = 2;
//        b = 4;
//        a = 1;
    }

    {
        j = 2.0;
    }

    public FinalDemo2() {
        k = 3.0;
    }

    public static void main(String[] args) {
        System.out.println(FinalDemo2.a);
        System.out.println(FinalDemo2.b);

        FinalDemo2 demo2 = new FinalDemo2();
        System.out.println(demo2.i);
        System.out.println(demo2.j);
        System.out.println(demo2.k);
    }
}
