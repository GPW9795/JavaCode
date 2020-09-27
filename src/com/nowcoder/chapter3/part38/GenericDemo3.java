package com.nowcoder.chapter3.part38;


/**
 * 类型形参的上限
 */
public class GenericDemo3 {

    public static void main(String[] args) {
        First<Integer> f1 = new First<>(100);
        System.out.println(f1.getData().doubleValue());

        First<String> f2 = new First<>("abc");
        System.out.println(f2.getData().toUpperCase());

        Second<Integer> s1 = new Second<>(100);
        System.out.println(f1.getData().doubleValue());

//        Second<String> s2 = new Second<>("abc");
//        System.out.println(f2.getData().toUpperCase());
    }

}

// Number只是名字，与T一样
class First<Number> {
    private Number data;

    public First() {

    }

    public First(Number data) {
        this.data = data;
    }

    public Number getData() {
        return data;
    }
}

class Second<T extends Number> {
    private T data;

    public Second(){

    }

    public Second(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
