package org.example.newtest.Studies;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MyBook {
    private String title;

    public MyBook(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyBook book = (MyBook) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "}";
    }

    public static void main(String[] args) {
        MyBook book1 = new MyBook("Java Programming");
        MyBook book2 = new MyBook("Java Programming");
        MyBook book3 = new MyBook("Python Programming");

        System.out.println("book1 equals book2: " + book1.equals(book2));
        System.out.println("book1 equals book3: " + book1.equals(book3));

        System.out.println("book1 hashCode: " + book1.hashCode());
        System.out.println("book2 hashCode: " + book2.hashCode());
        System.out.println("book3 hashCode: " + book3.hashCode());

        Map<MyBook, String> library = new HashMap<>();
        library.put(book1, "Available");
        library.put(book2, "Checked out");

        System.out.println("Library size: " + library.size());
        System.out.println("Status of book1: " + library.get(book1));
        System.out.println("Status of book2: " + library.get(book2));

        library.put(book3, "Available");
        System.out.println("Library size after adding book3: " + library.size());
        System.out.println("Status of book3: " + library.get(book3));
    }
}