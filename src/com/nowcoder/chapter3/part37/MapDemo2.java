package com.nowcoder.chapter3.part37;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * HashMap
 */
public class MapDemo2 {

    public static void main(String[] args) {
        Map map = null;

//        map = new Hashtable();
//        map.put("gpw", null);
//        map.put(null, null);
        map = new HashMap();
        map.put("gpw", null);
        map.put("cbx", null);
        map.put("zxm", null);
        map.put(null, null);
        map.put(null, null);
        System.out.println(map);

        for (Object key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        map = new LinkedHashMap();
        map.put("Chinese", 40);
        map.put("Math", 100);
        map.put("English", 30);
        System.out.println(map);

        for (Object key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }

}
