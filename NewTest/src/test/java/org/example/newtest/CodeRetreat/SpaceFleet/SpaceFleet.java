package org.example.newtest.CodeRetreat.SpaceFleet;

import java.util.*;

public class SpaceFleet {
    public static void main(String[] args) {
        Map<String, Station> fleet = new LinkedHashMap<>();
        Set<String> uniqueNames = new HashSet<>();

        Spaceship s1 = new Spaceship("Enterprise", 150);
        Spaceship s2 = new Spaceship("Voyager", 120);

        OrbitalStation orbital = new OrbitalStation();
        LunarBase lunar = new LunarBase();

        orbital.dockShip(s1);
        lunar.dockShip(s2);

        s1.launch();

        Station st1 = orbital;
        Station st2 = lunar;

        fleet.put("Орбита", orbital);
        fleet.put("Луна", lunar);

        uniqueNames.add(s1.getName());
        uniqueNames.add(s2.getName());

        System.out.println("=== КОСМИЧЕСКИЙ ФЛОТ ===");
        fleet.values().forEach(Station::report);

        System.out.println("\nУникальные корабли: " + uniqueNames);
        System.out.println("Всего кораблей: " + Spaceship.getTotal());
    }
}