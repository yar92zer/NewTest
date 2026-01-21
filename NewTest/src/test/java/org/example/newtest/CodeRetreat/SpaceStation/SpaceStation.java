package org.example.newtest.CodeRetreat.SpaceStation;

import java.util.*;

public class SpaceStation {
    public static void main(String[] args) {
        Map<String, List<Module>> station = new HashMap<>();
        Set<String> unique = new HashSet<>();

        Astronaut a1 = new Astronaut("John", 100);
        Astronaut a2 = new Astronaut("Jane", 80);

        Module lab = new ScienceModule("Lab-1");
        Module dorm = new LivingModule("Dorm-A");

        lab.activate();
        dorm.activate();

        station.computeIfAbsent("Science", k -> new ArrayList<>()).add(lab);
        station.computeIfAbsent("Living", k -> new ArrayList<>()).add(dorm);

        unique.add(a1.toString().split(" ")[0]);
        unique.add(a2.toString().split(" ")[0]);

        System.out.println("=== СТАНЦИЯ ===");
        station.forEach((area, modules) -> System.out.println(area + ": " + modules));
        System.out.println("Уникальные: " + unique);
        System.out.println("Всего: " + Astronaut.getTotal());
    }
}
