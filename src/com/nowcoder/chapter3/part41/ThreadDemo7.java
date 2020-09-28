package com.nowcoder.chapter3.part41;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程安全问题（同步锁）
 */
public class ThreadDemo7 {

    public static void main(String[] args) {
        Ticket ticket = new Ticket(100);
        SellTask sellTask = new SellTask(ticket);
        new Thread(sellTask, "gpw").start();
        new Thread(sellTask, "cbx").start();
        new Thread(sellTask, "zxm").start();
        new Thread(sellTask, "lxm").start();
        new Thread(sellTask, "zdy").start();
    }

    private static class Ticket {

        private Lock lock = new ReentrantLock();

        private int amount;

        public Ticket(int amount) {
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public void buy(int amount){
            if (this.amount < amount) {
                throw new IllegalArgumentException("余量不足");
            }

            // 校验花费一些时间
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            lock.lock();
            try{
                // 通过校验成功购票
                this.amount -= amount;
                String name = Thread.currentThread().getName();
                System.out.println(name + "购买成功，剩余数量：" + this.amount);
            }
            finally {
                lock.unlock();
            }
        }
    }

    private static class SellTask implements Runnable {
        private Ticket ticket;

        public SellTask(Ticket ticket) {
            this.ticket = ticket;
        }

        @Override
        public void run() {
            ticket.buy(1);
        }
    }
}
