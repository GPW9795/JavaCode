package com.nowcoder.chapter3.part37;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet
 */
public class SetDemo2 {

    public static void main(String[] args) {
        TreeSet scores = new TreeSet();
        scores.add(83);
        scores.add(34);
        scores.add(98);
        scores.add(12);
        scores.add(76);
        scores.add(65);
        System.out.println(scores); // 自然排序, 有序但不是添加顺序

        System.out.println(scores.first() + " - " + scores.last());
        System.out.println(scores.lower(60) + " - " + scores.higher(60));
        System.out.println(scores.headSet(60));
        System.out.println(scores.tailSet(60));

        // 自然排序
        System.out.println();
        TreeSet names = new TreeSet();
        names.add("gpw");
        names.add("cbx");
        names.add("zxm");
        names.add("zdy");
        names.add("lxm");
        System.out.println(names);

        // 没有实现Comparable接口
//        TreeSet objs = new TreeSet();
//        objs.add(new Object());
//        objs.add(new Object());
//        objs.add(new Object());

        // 类型不一样, 没有可比性
//        TreeSet objs = new TreeSet();
//        objs.add(100);
//        objs.add("abc");

        // 定制排序
        TreeSet nums = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Number n1 = (Number) o1;
                Number n2 = (Number) o2;
                if (n1 == null && n2 == null) {
                    return 0;
                } else if (n1 == null) {
                    return 1;
                } else if (n2 == null) {
                    return -1;
                } else if (n1.doubleValue() > n2.doubleValue()) {
                    return -1;
                } else if (n1.doubleValue() < n2.doubleValue()) {
                    return 1;
                } else {
                    return 0;
                }

            }
        });
        nums.add(83);
        nums.add(34);
        nums.add(98);
        nums.add(12);
        nums.add(76);
        nums.add(65);
        nums.add(83.5);
        nums.add(null);
        System.out.println(nums);
    }

}
