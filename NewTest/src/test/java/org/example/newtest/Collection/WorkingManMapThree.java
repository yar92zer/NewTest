package org.example.newtest.Collection;

import java.util.*;

public class WorkingManMapThree {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 5);
        map.put("orange", 2);

        System.out.println(map.get("banana"));
        System.out.println(map.containsKey("apple"));
        map.remove("orange");
        System.out.println(map);
    }
}