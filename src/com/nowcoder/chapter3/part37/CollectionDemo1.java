package com.nowcoder.chapter3.part37;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Collection
 */
public class CollectionDemo1 {
    private static Date today = new Date();

    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add(today);
        c.add("nowcoder");
        c.add(10); // 自动装箱

        System.out.println(c); // toString()
        System.out.println(Arrays.toString(c.toArray()));
        System.out.println(c.size());

        System.out.println(c.contains(today));
        System.out.println(c.contains("nowcoder"));
        System.out.println(c.contains(10)); // 自动装箱

        c.remove(today);
        System.out.println(c);

        c.clear();
        System.out.println(c);
    }

}
