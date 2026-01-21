package org.example.newtest.Collection;

import java.util.*;

public class WorkingManTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(5);
        set.add(1);
        set.add(3);
        set.add(2);

        System.out.println(set);

        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(3);
        pq.add(2);

        System.out.println(pq.poll());
        System.out.println(pq);
    }
}