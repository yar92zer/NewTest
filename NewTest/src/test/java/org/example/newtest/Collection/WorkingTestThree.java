package org.example.newtest.Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class WorkingTestThree {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 1, 8, 3, 9, 2, 7);
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        queue.addAll(numbers);

        for (int i = 0; i < 3; i++) {
            System.out.println(queue.poll());
        }
    }
}