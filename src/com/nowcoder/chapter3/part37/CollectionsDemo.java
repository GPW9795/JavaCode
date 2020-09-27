package com.nowcoder.chapter3.part37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Collections
 */
public class CollectionsDemo {

    public static void main(String[] args) {
        // 排序
        List scores = new ArrayList();
        scores.add(70);
        scores.add(50);
        scores.add(60);
        scores.add(80);
        scores.add(90);
        System.out.println(scores);

        Collections.shuffle(scores);
        System.out.println(scores);

        Collections.sort(scores);
        System.out.println(scores);

        Collections.reverse(scores);
        System.out.println(scores);

        // 查找、替换
        // Collections
        Object max = Collections.max(scores);
        System.out.println(max);
        Object min = Collections.min(scores);
        System.out.println(min);

        // List
        int index = Collections.binarySearch(scores, 70);
        System.out.println(index);

        Collections.replaceAll(scores, 60, 65);
        System.out.println(scores);

        // 不可变集合
        List list = Collections.emptyList();
        System.out.println(list);
//        list.add(100);

        Set set = Collections.singleton(200);
        System.out.println(set);
//        set.add(300);

        List scoreList = Collections.unmodifiableList(scores);
        System.out.println(scoreList);
//        scoreList.add(80);
    }
}
