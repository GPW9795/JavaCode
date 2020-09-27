package com.nowcoder.chapter3.part38;

import java.util.*;

/**
 * 泛型
 */
public class GenericDemo1 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("gpw");
        names.add("zxm");
        names.add("zdy");
        names.add("cbx");
        names.add("lxm");
//        names.add(100);
        for (String name : names) {
            System.out.println(name.toUpperCase());
        }

        // Java 5
        Set<Double> set1 = new HashSet<Double>();
        Map<String, Double> map1 = new HashMap<String, Double>();

        // Java 7
        Set<Double> set2 = new HashSet<>();
        Map<String, Double> map2 = new HashMap<>();

    }

}
