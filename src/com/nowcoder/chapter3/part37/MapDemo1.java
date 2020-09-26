package com.nowcoder.chapter3.part37;

import java.util.HashMap;
import java.util.Map;

/**
 * Map
 */
public class MapDemo1 {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("gpw", 70);
        map.put("cbx", 80);
        map.put("zxm", 90);
        System.out.println(map);

        // value可以重复
        map.put("fpw", 80);
        System.out.println(map);

        // key重复会导致覆盖
        map.put("fpw", 50);
        System.out.println(map);

        map.remove("fpw");
        System.out.println(map);

        System.out.println(map.get("gpw"));
        System.out.println(map.containsKey("cbx"));
        System.out.println(map.containsValue(85));

        // Entry, entrySet()
        for (Object entry : map.entrySet()) {
            Map.Entry e = (Map.Entry) entry;
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        // keySet()
        for (Object key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        // values()
        for (Object value : map.values()) {
            System.out.println(value);
        }
    }

}
