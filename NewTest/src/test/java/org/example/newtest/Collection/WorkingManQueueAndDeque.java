package org.example.newtest.Collection;

import java.util.*;

public class WorkingManQueueAndDeque {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        System.out.println(queue.poll());
        System.out.println(queue);

        Deque<String>stack = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack);
    }
}