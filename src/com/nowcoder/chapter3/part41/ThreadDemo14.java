package com.nowcoder.chapter3.part41;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * ForkJoinPool
 */
public class ThreadDemo14 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] nums = new int[100];
        for (int i = 1; i <= 100; i++) {
            nums[i - 1] = i;
        }

        ForkJoinPool pool = new ForkJoinPool();
        Future<Integer> future = pool.submit(new FjTask(nums, 0, nums.length - 1));
        System.out.println(future.get());
    }

    private static class FjTask extends RecursiveTask<Integer> {

        private static final int THRESHOLD = 10;
        private int[] nums;
        private int start, end;

        public FjTask(int[] nums, int start, int end) {
            this.nums = nums;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            System.out.printf("%-25s\t%2d,%2d\n", Thread.currentThread().getName(), start, end);

            Integer sum = 0;

            if (end - start < THRESHOLD) {
                for (int i = start; i <= end; i++) {
                    sum += nums[i];
                }
            } else {
                int middle = (start + end) / 2;
                FjTask left = new FjTask(nums, start, middle);
                FjTask right = new FjTask(nums, middle + 1, end);
                left.fork();
                right.fork();
                sum = left.join() + right.join();
            }

            return sum;
        }
    }

}

