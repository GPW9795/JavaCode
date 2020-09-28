package com.nowcoder.chapter3.part41;

/**
 * 控制线程示例
 */
public class ThreadDemo3 {

    public static void main(String[] args) throws InterruptedException {
//        testJoinThread();
//        testDaemonThread();
        testThreadPriority();
    }

    private static class JoinThreadTask implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 30; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        }
    }

    public static void testJoinThread() throws InterruptedException {
        new Thread(new JoinThreadTask()).start();
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + "\t\t" + i);
            if (i == 10) {
                Thread thread = new Thread(new JoinThreadTask());
                thread.start();
                thread.join();
            }
        }
    }

    private static class DaemonThreadTask implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        }
    }

    public static void testDaemonThread() {
        // 后台线程
        Thread thread = new Thread(new DaemonThreadTask());
        thread.setDaemon(true);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "\t\t" + i);
        }
    }

    private static class PriorityThreadTask implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        }
    }

    public static void testThreadPriority() {
        Thread thread0 = new Thread(new PriorityThreadTask());
        Thread thread1 = new Thread(new PriorityThreadTask());

//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(thread0.getPriority());
//        System.out.println(thread1.getPriority());

        thread0.setPriority(Thread.MAX_PRIORITY);
        thread0.start();

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
    }
}
