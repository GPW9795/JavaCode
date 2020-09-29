package com.nowcoder.chapter3.part41;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 阻塞队列
 */
public class ThreadDemo11 {

    public static void main(String[] args) {
        BlockingQueue<Long> queue = new ArrayBlockingQueue<>(10);
        new Thread(new Producer(queue), "P1").start();
        new Thread(new Producer(queue), "P2").start();
        new Thread(new Producer(queue), "P3").start();
        new Thread(new Producer(queue), "P4").start();
        new Thread(new Producer(queue), "P5").start();
        new Thread(new Customer(queue), "C1").start();
        new Thread(new Customer(queue), "C2").start();
        new Thread(new Customer(queue), "C3").start();
    }

    private static class Producer implements Runnable {

        private BlockingQueue<Long> queue;

        public Producer(BlockingQueue<Long> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(new Random().nextInt(1000));
                    queue.put(System.currentTimeMillis());
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "生产了一条数据，剩余" + queue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class Customer implements Runnable {
        private BlockingQueue<Long> queue;

        public Customer(BlockingQueue<Long> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(new Random().nextInt(1000));
                    queue.take();
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "消费了一条数据，剩余：" + queue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}