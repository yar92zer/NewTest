package org.example.newtest.CodeRetreat.LibrarySystem;

import java.util.*;

public class LibrarySystem {
    public static void main(String[] args) {
        Map<String, Section> library = new LinkedHashMap<>();
        Set<String> uniqueAuthors = new HashSet<>();

        Book b1 = new Book("1984", "Джордж Оруэлл");
        Book b2 = new Book("Квантовая физика", "Ричард Фейнман");

        FictionSection fiction = new FictionSection();
        ScienceSection science = new ScienceSection();

        fiction.add(b1);
        science.add(b2);

        b1.borrow();
        b2.borrow();

        Section s1 = fiction;
        Section s2 = science;

        library.put("Художественная", fiction);
        library.put("Научная", science);

        uniqueAuthors.add(b1.getAuthor().split(" ")[0]);
        uniqueAuthors.add(b2.getAuthor().split(" ")[1]);

        System.out.println("=== СИСТЕМА БИБЛИОТЕКИ ===");
        library.values().forEach(Section::show);

        System.out.println("\nУникальные авторы: " + uniqueAuthors);
        System.out.println("Всего книг: " + Book.getTotal());
    }
}