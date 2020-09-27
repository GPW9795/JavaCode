package com.nowcoder.chapter3.part38;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 类型通配符
 */
public class GenericDemo4 {

    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        List<String> strs = new ArrayList<>();

        // 错误示范
        test1(objs);
//        test1(strs);

        // 使用通配符，正确示范
        test2(objs);
        test2(strs);

        // 错误示范
        Set<?> set = new HashSet<>();
//        set.add("abc");
    }

    public static void test1(List<Object> list){
        System.out.println(list);
    }

    // 类型通配符
    public static void test2(List<?> list){
        System.out.println(list);
        // 错误示范
//        list.add(100);
    }

}
