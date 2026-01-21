package org.example.newtest.Collection;

import java.util.*;

public class WorkingManListOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        list.remove(1);
        System.out.println(list.get(1));
        for (String item :list){
            System.out.println(item);
        }

        System.out.println(list);
    }
}