package org.example.newtest.CodeRetreat.KingTalsaSecure;

import java.util.*;

public class KingTalsaSecure {
    public static void main(String[] args) {
        Set<King> authorizedKings = new HashSet<>();
        List<String> accessLog = new ArrayList<>();

        authorizedKings.add(new King("Король Артас", "TALSA-777"));
        authorizedKings.add(new King("Король Талса", "IMPERIA-001"));
        authorizedKings.add(new King("Король Артас", "неважно"));

        System.out.println("ИПЕРИЯ ТАЛСЫ: ЗАЩИЗЩЁННЫЙ ВХОД");
        System.out.println("════════════════════════════════════");

        String[] attempts = {
                "TALSA-777",
                "неправильно",
                "IMPERIA-001",
                "TALSA-777"
        };
        String[] kingNames = {"Король Артас", "Король Артас", "Король Талса", "Король Артас"};
        for (int i = 0; i < attempts.length; i++) {
            String code = attempts[i];
            String name = kingNames[i];

            try {
                King king = authorizedKings.stream()
                        .filter(k -> k.getName().equals(name))
                        .findFirst()
                        .orElseThrow(() -> new AccessDeniedException("Король не найден: " + name));
                king.activate(code);
                accessLog.add("[УСПЕХ] " + name + " вошёл");
            } catch (AccessDeniedException e) {
                System.err.println("[ОТКАЗ] " + e.getMessage());
                accessLog.add(" [ОТКАЗ] " + name);
            }
        }
        System.out.println("\nЛОГ ДОСТУПА:");
        accessLog.forEach(System.out::println);

        System.out.println("\nАвторизованные короли: " + authorizedKings);
        System.out.println("[SUCCESS] Система защиты активна!");
    }
}