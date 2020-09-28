package com.nowcoder.chapter3.part41;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的示例
 */
public class ThreadDemo1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1
//        new First().start();
//        new First().start();

        // 2
//        new Thread(new Second()).start();
//        new Thread(new Second()).start();

        // 3
        FutureTask<String> task1 = new FutureTask<>(new Third());
        FutureTask<String> task2= new FutureTask<>(new Third());
        new Thread(task1).start();
        new Thread(task2).start();

        // 主线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "\t\t" + i);
        }

        // 阻塞方法
        System.out.println("返回值" + task1.get());
        System.out.println("返回值" + task2.get());
    }

    private static class First extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        }
    }

    private static class Second implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        }
    }

    private static class Third implements Callable{
        @Override
        public Object call() throws Exception {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            return Thread.currentThread().getName();
        }
    }
}
