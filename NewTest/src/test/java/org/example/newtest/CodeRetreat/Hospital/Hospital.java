package org.example.newtest.CodeRetreat.Hospital;

import java.util.*;

public class Hospital {
    public static void main(String[] args) {
        Map<String, List<Patient>> departments = new HashMap<>();
        Set<String> uniqueNames = new HashSet<>();

        try {
            Patient p1 = new Patient("Alice", 30, "Flu");
            Patient p2 = new Patient("Bob", 45, "Broken arm");
            Doctor d1 = new Doctor("House", 50, "Diagnostics");

            departments.computeIfAbsent("General", k -> new ArrayList<>()).add(p1);
            departments.computeIfAbsent("Orthopedics", k -> new ArrayList<>()).add(p2);

            uniqueNames.add(p1.name);
            uniqueNames.add(p2.name);
            uniqueNames.add(d1.name);

            System.out.println("=== БОЛЬНИЦА ===");
            departments.forEach((dept, patients) -> System.out.println(dept + ": " + patients));

            System.out.println("Уникальные имена: " + uniqueNames);
            System.out.print("Всего людей: " + Person.getTotal());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}