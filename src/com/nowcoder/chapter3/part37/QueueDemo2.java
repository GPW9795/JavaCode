package com.nowcoder.chapter3.part37;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * Deque
 */
public class QueueDemo2 {

    public static void main(String[] args) {
        // 双端队列
        Deque deque = new ArrayDeque();
        deque.offer("gpw");
        deque.offer("cbx");
        deque.offer("zxm");
        System.out.println(deque);

        deque.offerFirst("hhh"); // == offer()
        System.out.println(deque);

        deque.offerLast("ggg");
        System.out.println(deque);

        System.out.println(deque.peekFirst()); // peek()
        System.out.println(deque.peekLast());
        System.out.println(deque);

        while (deque.size() > 0) {
//            System.out.println(deque.pollLast());
            System.out.println(deque.pollFirst()); // == poll()
        }
        System.out.println(deque);

        // 栈
        Deque stack = new ArrayDeque();
        stack.push("gpw");
        stack.push("cbx");
        stack.push("zxm");
        System.out.println(stack);

        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
        System.out.println(stack);
    }

}
