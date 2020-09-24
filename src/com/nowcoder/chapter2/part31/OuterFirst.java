package com.nowcoder.chapter2.part31;

public class OuterFirst {

    private int width = 1024;

    public void print() {
        Inner inner = new Inner(1920, 1080);
        inner.print();
        System.out.println("OuterFirst: " + inner.width);
    }

    static {
//        Inner inner = new Inner(1920, 1080);
    }

    public static void show(){
//        Inner inner = new Inner(1920, 1080);
    }

    // 非静态内部类
    public class Inner {

        private int width;
        private int height;

        public Inner(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public void print() {
            System.out.println("Inner: " + this.width);
            System.out.println("Inner: " + this.height);
            System.out.println("Inner: " + OuterFirst.this.width);
        }

//        public static int i;
    }
}
