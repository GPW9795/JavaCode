package com.nowcoder.chapter3.part38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 泛型方法
 */
public class GenericDemo6 {

    public static void main(String[] args) {
        String[] nameArray = {"gpw", "cbx"};
        List<String> nameList = new ArrayList<>();
        arrayToList(nameArray, nameList);
        System.out.println(Arrays.toString(nameArray));
        System.out.println(nameList);

        Double[] scoreArray = {70.00, 80.00, 90.00};
        List<Double> scoreList = new ArrayList<>();
        arrayToList(scoreArray, scoreList);
        System.out.println(scoreList);

        // 不要制造出迷惑的场景
        Integer[] numberArray = {10, 203, 40};
        List<Double> numberList = new ArrayList<>();
//        arrayToList(numberArray, numberList);
    }

    public static <T> void arrayToList(T[] array, List<T> list) {
        if (array == null || list == null) {
            return;
        }
        for (T t : array) {
            list.add(t);
        }
    }
}
