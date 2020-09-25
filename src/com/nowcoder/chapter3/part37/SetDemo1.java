package com.nowcoder.chapter3.part37;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * HashSet
 */
public class SetDemo1 {

    public static void main(String[] args) {
        HashSet students = new HashSet();
        students.add("gpw");
        students.add("cbx");
        students.add("zxm");
        students.add("zdy");
        students.add("lxm");
        students.add(null);
        System.out.println(students);

        System.out.println();
        LinkedHashSet teachers = new LinkedHashSet();
        teachers.add("gpw");
        teachers.add("cbx");
        teachers.add("zxm");
        teachers.add("zdy");
        teachers.add("lxm");
        teachers.add("lxm"); // false
        teachers.add(null);
        System.out.println(teachers);

    }

}
