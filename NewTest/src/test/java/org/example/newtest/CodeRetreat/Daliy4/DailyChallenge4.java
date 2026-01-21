package org.example.newtest.CodeRetreat.Daliy4;

import java.util.*;

public class DailyChallenge4 {
    public static void main(String[] args) {
        Map<String, List<Animal>> enclosures = new HashMap<>();
        Set<String> uniqueNames = new HashSet<>();
         try{
        Lion lion1 = new Lion("Simba", 5);
        Lion lion2 = new Lion("Nala", 4);
        Mammal elephant = new Mammal("Dumbo", 10);

        lion1.feed();
        lion1.feed();
        lion2.feed();

        enclosures.computeIfAbsent("Savanna", k -> new ArrayList<>()).add(lion1);
        enclosures.computeIfAbsent("Savanna", k -> new ArrayList<>()).add(lion2);
        enclosures.computeIfAbsent("Jungle", k -> new ArrayList<>()).add(elephant);

        uniqueNames.add(lion1.getName());
        uniqueNames.add(lion1.getName());
        uniqueNames.add(lion2.getName());

        System.out.println("=== ЗООПАРК ===");
        enclosures.forEach((encl, animals) -> System.out.println(encl + ": " + animals));
        System.out.println("nУникальные имена: " + uniqueNames);
        System.out.println("Всего животных: " + Animal.getTotalAnimals());

    }catch(IllegalArgumentException e) {
             System.out.println("Ошибка: " + e.getMessage());
         }
    }
}