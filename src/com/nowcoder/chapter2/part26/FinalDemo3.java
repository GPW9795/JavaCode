package com.nowcoder.chapter2.part26;


/*final修饰局部变量*/
public class FinalDemo3 {

    public static void showInt(final int a) {
        System.out.println("a=" + a);
    }

    public void showDouble(final double a){
        System.out.println("a=" + a);
    }

    public static void main(String[] args) {
        final int i = 1;
        System.out.println("i=" + i);

        final double d;
        d = 2;
        System.out.println("d=" + d);

        FinalDemo3.showInt(1);
        new FinalDemo3().showDouble(4.0);
    }
}
