package com.nowcoder.chapter1.part08;

/*嵌套循环*/
public class LoopDemo7 {

    // 打印1~100之间所有的质数
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean b = true;
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.print(i + "\t");
            }
        }
    }
}
