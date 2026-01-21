package org.example.newtest.CodeRetreat.Game;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        Map<String, List<Character>> teams = new HashMap<>();
        Set<String> uniqueNames = new HashSet<>();

        try {
            Warrior w1 = new Warrior("Conan", 100);
            Character m1 = new Character("Gandalf", 80);

            w1.takeDamage(30);
            m1.takeDamage(90);

            teams.computeIfAbsent("Heroes", k -> new ArrayList<>()).add(w1);
            teams.computeIfAbsent("Heroes", k -> new ArrayList<>()).add(m1);

            uniqueNames.add(w1.name);
            uniqueNames.add(m1.name);

            System.out.println("=== ИГРА ===");
            teams.forEach((t, chars) -> System.out.println(t + ": " + chars));
            System.out.println("Живые: " + teams.get("Heroes").stream().filter(Character::isAlive).count());
            System.out.println("Всего персонажей: " + Character.getTotal());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}