package com.nowcoder.chapter3.part37;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Queue
 */
public class QueueDemo1 {

    public static void main(String[] args) {
        Queue queue = new ArrayDeque();
        queue.offer("gpw");
        queue.offer("cbx");
        queue.offer("zxm");
        queue.offer("lxm");
        System.out.println(queue);

        // 返回头部(不删), 队列为空时返回null
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue);

        // 返回头部(删), 队列为空时返回null
        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
        System.out.println(queue);

    }

}
