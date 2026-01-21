package org.example.newtest.Studies;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grape");
        arrayList.add("Mango");
        System.out.println(arrayList);

        arrayList.remove("Banana");
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        Set<String> hashSet= new HashSet<>();
        hashSet.add("Cat");
        hashSet.add("Dog");
        hashSet.add("Cat");
        hashSet.add("Bird");

        System.out.println(hashSet);
        System.out.println(hashSet.contains("Dog"));
        System.out.println(hashSet.add("Cat"));

        Map<String, Integer> hashMap= new HashMap<>();
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 28);
        hashMap.put("Diana", 22);

        System.out.println(hashMap);
        System.out.println(hashMap.get("Alice"));
        System.out.println(hashMap.containsKey("Bob"));
    }
}