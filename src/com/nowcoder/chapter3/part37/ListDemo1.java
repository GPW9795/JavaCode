package com.nowcoder.chapter3.part37;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/**
 * List
 */
public class ListDemo1 {

    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("gpw");
        names.add("cbx");
        names.add("zxm");
        names.add("zdy");
        names.add("lxm");
        System.out.println(names);

        names.add(1, "hhh");
        System.out.println(names);

        names.remove(1);
        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + " : " + names.get(i));
        }

        System.out.println(names.subList(1, 4));
        System.out.println(names.indexOf("gpw") + "," + names.lastIndexOf("gpw"));

        ListIterator iterator = names.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();

        // 排序
        names.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String n1 = (String) o1;
                String n2 = (String) o2;
                if (n1 == null && n2 == null) {
                    return 0;
                } else if (n1 == null) {
                    return -1;
                } else if (n2 == null) {
                    return 1;
                } else {
                    return n1.compareTo(n2);
                }
            }
        });
        System.out.println(names);
    }

}
