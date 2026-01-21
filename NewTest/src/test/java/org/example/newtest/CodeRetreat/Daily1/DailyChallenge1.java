package org.example.newtest.CodeRetreat.Daily1;

import java.util.*;

public class DailyChallenge1 {
    public static void main(String[] args) {
        Map<String, List<Book>> library = new HashMap<>();
        Set<Author> authors = new HashSet<>();
        try {
            SciFiBook b1 = new SciFiBook("Dune", "Frank Herbert", true);
            SciFiBook b2 = new SciFiBook("Neuromancer", "William Gibson", false);
            FictionBook b3 = new FictionBook("1984", "George Orwell", "Dystopia");
            library.computeIfAbsent("Sci-Fi", k -> new ArrayList<>()).add(b1);
            library.computeIfAbsent("Sci-Fi", k -> new ArrayList<>()).add(b2);
            library.computeIfAbsent("Dystopia", k -> new ArrayList<>()).add(b3);

            authors.add(new Author("Frank Herber"));
            authors.add(new Author("Frank Herber"));
            authors.add(new Author("William Gibson"));

            System.out.println("\nУникальные авторы; " + authors);
            System.out.println("Всего книг создано: " + Book.getTotalBooks());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка; " + e.getMessage());
        }
    }
}