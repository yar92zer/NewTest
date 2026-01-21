package org.example.newtest.CodeRetreat.Daily2;

import java.util.*;

public class DailyChallenge2 {
    public static void main(String[] args) {
        Map<String, List<Product>> shop = new HashMap<>();
        Set<Client> clients = new HashSet<>();
        try {
            Smartphone phone = new Smartphone("iPhone 15", 1000, "Apple");
            Product banana = new Product("Banana", 1.5);

            shop.computeIfAbsent("Electronics", k -> new ArrayList<>()).add(phone);
            shop.computeIfAbsent("Food", k -> new ArrayList<>()).add(banana);

            clients.add(new Client("Alice"));
            clients.add(new Client("Alice"));
            clients.add(new Client("Bob"));

            System.out.println("=== Магазин ===");
            shop.forEach((cat, list) -> System.out.println(cat + ": " + list));

            System.out.println("\nUnique clients: " + clients);
            System.out.println("Total products: " + Product.getTotalProducts());
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}