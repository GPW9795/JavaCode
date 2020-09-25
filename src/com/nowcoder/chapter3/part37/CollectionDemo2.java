package com.nowcoder.chapter3.part37;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator
 */
public class CollectionDemo2 {

    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("gpw");
        c.add("cbx");
        c.add("zxm");
        c.add("zdy");
        c.add("lxm");

        for (Object obj : c) {
            System.out.println(obj);
//            if (obj.equals("cbx")) {
//                c.remove(obj);
//            }
        }

        System.out.println();

        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
            if (obj.equals("zdy")) {
//                c.remove(obj);
                iterator.remove();
            }
        }
        System.out.println(c);
    }

}
