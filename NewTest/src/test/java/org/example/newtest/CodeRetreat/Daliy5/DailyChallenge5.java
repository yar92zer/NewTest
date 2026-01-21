package org.example.newtest.CodeRetreat.Daliy5;

import java.util.*;

public class DailyChallenge5 {
    public static void main(String[] args) {
        Map<String, List<Vehicle>> showroom = new HashMap<>();
        Set<String> uniqueVINs = new HashSet<>();
        try {
            ElectricCar tesla = new ElectricCar("Model S", 80000, "TSLA123");
            Car bmw = new Car("M3", 60000, "BMW456");

            tesla.testDrive();
            tesla.testDrive();
            tesla.testDrive();
            tesla.testDrive();
            tesla.testDrive();

            showroom.computeIfAbsent("Electric", k -> new ArrayList<>()).add(tesla);
            showroom.computeIfAbsent("Petrol", k -> new ArrayList<>()).add(bmw);

            uniqueVINs.add(tesla.getVin());
            uniqueVINs.add(tesla.getVin());
            uniqueVINs.add(bmw.getVin());

            System.out.println("=== АВТОСАЛОН ===");
            showroom.forEach((type, cars) -> System.out.println(type + ": " + cars));
            System.out.println("\nУникальные VIN: " + uniqueVINs);
            System.out.println("Всего машин: " + Vehicle.getTotalVehicles());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}