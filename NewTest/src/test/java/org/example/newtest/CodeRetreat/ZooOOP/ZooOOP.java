package org.example.newtest.CodeRetreat.ZooOOP;

import java.util.*;

public class ZooOOP {
    public static void main(String[] args) {
        Map<String, Enclosure> zoo = new HashMap<>();
        Set<String> uniqueNames = new HashSet<>();

        try {
            Animal eagle = new Animal("Орёл", 5);
            Animal shark = new Animal("Акула", 3);
            Animal penguin = new Animal("Пингвин", 4);

            Aviary aviary = new Aviary();
            Aquarium aquarium = new Aquarium();

            aviary.addAnimal(eagle);
            aviary.addAnimal(penguin);
            aquarium.addAnimal(shark);

            Enclosure e1 = aviary;
            Enclosure e2 = aquarium;

            zoo.put("Птицы", aviary);
            zoo.put("Морские", aquarium);

            eagle.feed();
            shark.feed();

            uniqueNames.add(eagle.getName());
            uniqueNames.add(shark.getName());
            uniqueNames.add(penguin.getName());

            System.out.println("=== ЗООПАРК ===");
            zoo.values().forEach(Enclosure::showInfo);

            System.out.println("\nУникальные имена: " + uniqueNames);
            System.out.println("Всего животных: " + Animal.getTotal());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}