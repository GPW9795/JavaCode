package com.nowcoder.chapter3.part38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 泛型方法与类型通配符
 */
public class GenericDemo7 {

    public static void main(String[] args) {
        String[] nameArray = {"gpw", "cbx"};
        List<String> nameList = new ArrayList<>();
        arrayToList(nameArray, nameList);
        System.out.println(nameList);

        Double[] scoreArray = {70.00, 80.00, 90.00};
        List<Number> scoreList = new ArrayList<>();
        arrayToList(scoreArray, scoreList);
        System.out.println(scoreList);
    }

    public static <T, S extends T> void arrayToList(S[] array, List<T> list) {
        if (array == null || list == null) {
            return;
        }
        for (S t : array) {
            list.add(t);
        }
    }

}
