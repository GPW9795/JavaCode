package com.nowcoder.chapter3.part37;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ArrayList
 */
public class ListDemo2 {

    public static void main(String[] args) {
        // 0, 10, 10 + 10/2(扩容1.5倍)
        ArrayList names = new ArrayList();
        names.add("gpw");
        names.add("gpw");
        names.add("gpw");
        names.add("gpw");
        names.add("gpw");
        names.add("gpw");
        names.add("gpw");
        names.add("gpw");
        names.add("gpw");
        names.add("gpw");
        names.add("gpw"); // 11

        // Arrays.ArrayList
        Integer[] nums = {10, 20, 30, 40, 50};
        List numList = Arrays.asList(nums);
        System.out.println(numList);
    }

}
