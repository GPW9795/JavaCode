package com.nowcoder.chapter3.part38;


import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的定义
 */
public class GenericDemo2 {

    public static void main(String[] args) {
        // 使用泛型类
        Foo<String> f1 = new Foo<>("gpw");
        System.out.println(f1.getData().toUpperCase());

        Foo<Integer> f2 = new Foo<>(100);
        System.out.println(f2.getData().doubleValue());

        // 使用泛型类的子类
        Alpha alpha = new Alpha("gpw");
        System.out.println(alpha.getData());

        Beta beta = new Beta(200);
        System.out.println(beta.getData().toString());

        List<String> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        System.out.println(list1.getClass().toString());
        System.out.println(list2.getClass().toString());
        System.out.println(list1.getClass() == list2.getClass());
    }

}

// 定义泛型类（接口）
class Foo<T> {

    private T data;

    public Foo() {

    }

    public Foo(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

// 定义泛型类的子类（接口）
class Alpha extends Foo<String> {

    public Alpha() {
    }

    public Alpha(String data) {
        super(data);
    }

    @Override
    public String getData() {
        return super.getData();
    }
}

class Beta extends Foo {
    public Beta() {
    }

    public Beta(Object data) {
        super(data);
    }

    @Override
    public Object getData() {
        return super.getData();
    }
}

