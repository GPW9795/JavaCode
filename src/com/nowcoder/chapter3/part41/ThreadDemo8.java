package com.nowcoder.chapter3.part41;

import java.io.ObjectInputStream;

/**
 * 死锁
 */
public class ThreadDemo8 {

    public static void main(String[] args) {
        String a = "A";
        String b = "B";
        new Thread(new FirstTask(a, b)).start();
        new Thread(new SecondTask(a, b)).start();
    }

    private static class FirstTask implements Runnable {

        private Object a;
        private Object b;

        public FirstTask(Object a, Object b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            synchronized (a) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (b) {
                    System.out.println("First");
                }
            }
        }
    }

    private static class SecondTask implements Runnable {

        private Object a;
        private Object b;

        public SecondTask(Object a, Object b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            synchronized (b) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (a) {
                    System.out.println("Second");
                }
            }
        }
    }
}
