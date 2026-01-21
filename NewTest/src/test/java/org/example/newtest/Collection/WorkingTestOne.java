package org.example.newtest.Collection;

import java.util.*;
public class WorkingTestOne {
    public static void main(String[] args){
        Set<String> set= new LinkedHashSet<>();
        set.add("a");
        set.add("b");
        set.add("a");
        set.add("c");
        set.add("b");
        set.add("d");

        System.out.println(set);
    }
}