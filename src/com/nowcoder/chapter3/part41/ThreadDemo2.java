package com.nowcoder.chapter3.part41;

/**
 * 线程的生命周期
 */
public class ThreadDemo2 {

    public static void main(String[] args) throws InterruptedException {
        // 误区, 相当于直接写了for循环
//        new Thread(new ThreadTask()).run();

        // 新建
        Thread thread0 = new Thread(new ThreadTask());
        Thread thread1 = new Thread(new ThreadTask());

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "\t\t" + i);
            if (i == 10){
                // 子线程就绪
                thread0.start();
                thread1.start();
                // 主线程就绪
//                Thread.yield();
                // 主线程阻塞
                Thread.sleep(1);
            }
        }

        // 子线程死亡
//        thread0.start();
    }

    private static class ThreadTask implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        }
    }

}
