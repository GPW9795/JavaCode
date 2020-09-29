package com.nowcoder.chapter3.part41;

import java.io.RandomAccessFile;

/**
 * 线程通信(Lock)
 */
public class ThreadDemo9 {

    public static void main(String[] args) {
        Product product = new Product(0);

        for (int i = 0; i < 100; i++) {
            new Thread(new BuyTask(product), "顾客" + i).start();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new SellTask(product), "卖家").start();
    }

    private static class Product {

        private int amount;

        public Product(int amount) {
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }
    }

    private static class BuyTask implements Runnable {

        private Product product;

        public BuyTask(Product product) {
            this.product = product;
        }

        @Override
        public void run() {
            synchronized (product) {
                String name = Thread.currentThread().getName();
                while (product.getAmount() == 0) {
                    try {
                        System.out.println(name + "已做好准备，等待抢购...");
                        product.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                product.setAmount(product.getAmount() - 1);
                System.out.println(name + "抢到1件商品，剩余库存：" + product.getAmount());
            }
        }
    }

    private static class SellTask implements Runnable {

        private Product product;

        public SellTask(Product product) {
            this.product = product;
        }

        @Override
        public void run() {
            synchronized (product) {
                product.setAmount(10);
                String name = Thread.currentThread().getName();
                System.out.println(name + "上架了10个库存，剩余库存：" + product.getAmount());
                product.notifyAll();
            }
        }
    }
}
