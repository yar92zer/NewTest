package org.example.newtest.CodeRetreat.LibraryOOP;

import java.util.*;

public class LibraryOOP {
    public static void main(String[] args) {
        Map<String, Shelf> library = new HashMap<>();
        Set<String> uniqueAuthors = new HashSet<>();

        try {
            Book b1 = new Book("1984", "Оруэлл");
            Book b2 = new Book("Квантовая физика", "Фейнман");
            Book b3 = new Book("Война и мир", "Толстой");

            FictionShelf fiction = new FictionShelf();
            ScienceShelf science = new ScienceShelf();

            fiction.addBook(b1);
            fiction.addBook(b3);
            science.addBook(b2);

            Shelf s1 = fiction;
            Shelf s2 = science;

            library.put("Художественная", fiction);
            library.put("Научная", science);

            b1.borrow();
            b3.borrow();

            uniqueAuthors.add(b1.getAuthor());
            uniqueAuthors.add(b2.getAuthor());
            uniqueAuthors.add(b3.getAuthor());

            System.out.println("=== БИБЛИОТЕКА ===");
            library.values().forEach(Shelf::display);
            System.out.println("\nУникальные авторы: " + uniqueAuthors);
            System.out.println("Всего книг: " + Book.getTotalBooks());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
