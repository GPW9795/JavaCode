package com.nowcoder.chapter3.part41;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 线程组
 */
public class ThreadDemo12 {

    public static void main(String[] args) {
        // 主线程的线程组
        ThreadGroup g = Thread.currentThread().getThreadGroup();
        System.out.println(g.getName() + ", " + g.isDaemon() + ", " + g.activeCount());
        g.list();

        // 子线程的线程组
        Thread thread = new Thread(new ThreadTask());
        thread.start();
        System.out.println(thread);

        // 自定义的线程组
        g = new ThreadGroup("TEST");
        g.setDaemon(true);
        thread = new Thread(g, new ThreadTask());
        thread.start();
        System.out.println(thread);

        // 销毁的后台线程组
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(g.isDestroyed());

        // 异常的处理器
        Thread.setDefaultUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println(t + "->" + e);
                    }
                }
        );
        System.out.println(3 / 0);
    }

    private static class ThreadTask implements Runnable {
        @Override
        public void run() {
            System.out.println(System.currentTimeMillis());
        }
    }

}

