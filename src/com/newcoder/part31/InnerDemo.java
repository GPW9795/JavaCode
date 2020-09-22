package com.newcoder.part31;

import com.newcoder.part30.util.ArrayUtil;
import com.newcoder.part30.util.Comparator;

import java.util.Arrays;

// 内部类
public class InnerDemo {

    public static void main(String[] args) {

        // 非静态内部类
        OuterFirst.Inner finner = new OuterFirst().new Inner(1920, 1080);
        finner.print();

        System.out.println();

        // 静态内部类，要求更少，语法更舒服,重点掌握
        OuterSecond.Inner.show();
        OuterSecond.Inner sinner = new OuterSecond.Inner("gpw");
        sinner.print();

        System.out.println();

        // 局部内部类，不能复用，不建议使用
        class Inner {
            private String code;

            public Inner(String code) {
                this.code = code;
            }

            public void print() {
                System.out.println(this.code);
            }
        }

        Inner inner = new Inner("001");
        System.out.println(inner.code);
        inner.print();

        System.out.println();

        // 匿名内部类，解决问题场景单一，重点掌握
        int[] nums = {10, 4, 13, 1, 8}; // 按照牌面排序
        ArrayUtil.sort(nums, new Comparator() {
            @Override
            public int compare(int m, int n) {
                return m - n;
            }
        });
        System.out.println(Arrays.toString(nums));
    }
}
