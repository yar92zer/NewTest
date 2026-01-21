package org.example.newtest;

import java.util.*;
import java.util.stream.*;

public class RandomListTasks {
    private static final Random r = new Random();
    private static final int MAX = 1000;
    private static final int COUNT = 5;

    public static void main(String[] args) {
        Set<Integer> used = new HashSet<>();
        List<Integer> limits = new ArrayList<>();

        while (limits.size() < COUNT) {
            int limit = ((r.nextInt(MAX / 10) + 1) * 10);
            if (used.add(limit)) {
                limits.add(limit);
            }
        }
        for (int limit : limits) {
            System.out.println("ВЕРНИ СПИСОК ОТ 1 ДО " + limit);
        }
    }
}