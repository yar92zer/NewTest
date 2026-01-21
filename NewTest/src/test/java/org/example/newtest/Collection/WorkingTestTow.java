package org.example.newtest.Collection;

import java.util.HashMap;
import java.util.Map;

public class WorkingTestTow {
    public static void main(String[] args) {
        String text = "abcaabb";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
    }
}