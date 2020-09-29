package com.nowcoder.chapter3.part41;

import java.util.concurrent.*;

/**
 * 线程池
 */
public class ThreadDemo13 {

    private static ExecutorService threadPool = Executors.newFixedThreadPool(3);
    private static ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(3);

    public static void main(String[] args) {
        Runnable threadTask = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " execute a thread task.");
            }
        };

        for (int i = 0; i < 10; i++) {
            threadPool.submit(threadTask);
        }

        Runnable scheduledTask = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " execute a thread scheduled task.");
            }
        };

        for (int i = 0; i < 5; i++) {
            scheduledPool.scheduleAtFixedRate(scheduledTask, 5, 3, TimeUnit.SECONDS);
        }
    }

}

