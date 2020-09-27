package com.nowcoder.chapter3.part38;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 擦除与转换
 */
public class GenericDemo8 {

    public static void main(String[] args) {
        // 擦除
        Anything<Integer> a = new Anything<>(100);
        System.out.println(a.getData().compareTo(200));

        Anything b = a;
        System.out.println(b.getData().doubleValue());

        List<String> list1 = new ArrayList<>();
        list1.add("abc");
        System.out.println(list1.get(0).toUpperCase());

        List list2 = list1;
        System.out.println(list2.get(0).toString());

        // 转换
        Queue queue = new ArrayDeque();
        queue.offer("gpw");
        queue.offer("cbx");

        // 有隐患
        Queue<String> queue1 = queue;
        System.out.println(queue1.poll().toUpperCase());

        // 错误示范
//        Queue<Integer> queue2 = queue;IO
//        System.out.println(queue2.poll().doubleValue());

    }

}

class Anything<T extends Number>{
    private T data;

    public Anything(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
