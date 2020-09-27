package com.nowcoder.chapter3.part37;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * TreeMap
 */
public class MapDemo4 {

    public static void main(String[] args) {
        TreeMap map = null;

        // 自然排序
        map = new TreeMap();
        map.put("gpw", 80);
        map.put("cbx", 45);
        map.put("zxm", 78);
        map.put("lxm", 90);
        map.put("zdy", 23);
        map.put("gtq", 56);
        System.out.println(map);

        System.out.println(map.firstKey() + ", " + map.lastKey());
        System.out.println(map.lowerKey("lxm") + ", " + map.higherKey("lxm"));
        System.out.println(map.headMap("lxm"));
        System.out.println(map.tailMap("lxm"));
        System.out.println(map.subMap("gpw", "zdy"));

        // 定制排序
        map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                if (s1 == null && s2 == null) {
                    return 0;
                } else if (s1 == null) {
                    return 1;
                } else if (s2 == null) {
                    return -1;
                } else {
                    return s2.compareTo(s1);
                }
            }
        });

        map.put("gpw", 80);
        map.put("cbx", 45);
        map.put("zxm", 78);
        map.put("lxm", 90);
        map.put("zdy", 23);
        map.put("gtq", 56);
        System.out.println(map);

    }

}
