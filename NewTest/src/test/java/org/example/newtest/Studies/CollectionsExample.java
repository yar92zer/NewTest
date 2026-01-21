package org.example.newtest.Studies;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args){
        List<String> fruits= new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Pineapple");
        fruits.add("Strawberry");
        fruits.add("Blueberry");
        fruits.add("Peach");

        System.out.println("---ArrayList---");
        System.out.println(String.join(", ",fruits));
        fruits.remove(2);
        System.out.println(String.join(", ",fruits));
        System.out.println(fruits.size());

        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);

        System.out.println("\n---HashSet---");
        System.out.println(numbers);
        System.out.println((numbers.contains(20)));
        System.out.println(numbers.add(20));

        Map<String, Integer>people =new HashMap<>();
        people.put("Emma", 19);
        people.put("Liam", 27);
        people.put("Sophia", 34);
        people.put("Noah", 23);

        System.out.println("\n---HashMap---");
        for(Map.Entry<String, Integer> entry: people.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
        System.out.println(people.get("Emma"));
        System.out.println((people.containsKey("Liam")));

    }
}
