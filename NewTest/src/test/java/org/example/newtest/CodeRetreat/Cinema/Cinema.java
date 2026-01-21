package org.example.newtest.CodeRetreat.Cinema;

import java.util.*;

public class Cinema {
    public static void main(String[] args) {
        Map<String, List<Screening>> schedule = new HashMap<>();
        Set<String> uniqueTitles = new HashSet<>();

        try {
            Screening s1 = new Screening("Inception", 148, "19:00");
            Screening s2 = new Screening("Matrix", 136, "21:30");

            s1.bookSeat();
            s1.bookSeat();
            s2.bookSeat();

            schedule.computeIfAbsent("Hall 1", k -> new ArrayList<>()).add(s1);
            schedule.computeIfAbsent("Hall 2", k -> new ArrayList<>()).add(s2);

            uniqueTitles.add(s1.title);
            uniqueTitles.add(s2.title);

            System.out.println("=== КИНОТЕАТР ===");
            schedule.forEach((hall, shows) -> System.out.println(hall + ":" + shows));
            System.out.println("Уникальные фильмы: " + uniqueTitles);
            System.out.println("Всего фильмов: " + Movie.getTotal());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}