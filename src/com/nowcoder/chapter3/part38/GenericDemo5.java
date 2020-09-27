package com.nowcoder.chapter3.part38;

import java.util.ArrayList;
import java.util.List;

/**
 * 通配符的上限
 */
public class GenericDemo5 {

    public static void main(String[] args) {
        // 编译不通过
        List<String> list = new ArrayList<>();
//        test(list);

        // 正确方式
        List<Integer> list1 = new ArrayList<>();
        test(list1);
    }

    public static void test(List<? extends Number> list){
        System.out.println(list);
        // 错误的示范
//        list.add(100);
    }
}
