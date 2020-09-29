package com.nowcoder.chapter3.part41;

/**
 * ThreadLocal
 */
public class ThreadDemo15 {

    private static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) {
        new Thread(new ThreadTask(100)).start();
        new Thread(new ThreadTask(200)).start();
        new Thread(new ThreadTask(300)).start();
    }

    public static void first() {
        System.out.println(Thread.currentThread().getName() + "execute first()");
        second();
    }

    public static void second() {
        System.out.println(Thread.currentThread().getName() + "execute second()");
        third();
    }

    public static void third() {
        System.out.println(Thread.currentThread().getName() + "execute third()");
        System.out.println(Thread.currentThread().getName() + "binding value" + threadLocal.get());
    }

    private static class ThreadTask implements Runnable {

        private Object value;

        public ThreadTask(Object value) {
            this.value = value;
        }

        @Override
        public void run() {
            threadLocal.set(value);
            first();
        }
    }
}

