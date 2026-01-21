package org.example.newtest.Collection;

import java.util.*;
public class WorkingManSetTow {
    public static void main(String[] args){
        Set<String> set= new HashSet<>();
        set.add("apple");
        set.add("apple");
        set.add("banana");
        set.add("banana");
        set.add("orange");
        System.out.println(set);
        System.out.println(set.contains("banana"));
    }
}