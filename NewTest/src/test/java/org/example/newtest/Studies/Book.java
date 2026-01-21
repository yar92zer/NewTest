package org.example.newtest.Studies;

public class Book {
    static int totalBooks = 0;
    static String libraryName = "City Library";
    static String bookHouse = "Book House";
    static String metro = "Metro";
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        totalBooks++;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public static String getLibraryName() {
        return libraryName;
    }

    public static String getBookHouse() {
        return bookHouse;
    }

    public static String getMetro() {
        return metro;
    }

    public String getDescription() {
        return "Title: " + title + ", Author: " + author;
    }

    public String getAuthor() {
        return author;
    }

    public static void resetTotalBooks() {
        totalBooks = 0;
    }

    public boolean hasWordInTitle(String word) {
        return title.contains(word);
    }

    public static void main(String[] args) {
        System.out.println("Library: " + Book.getLibraryName());
        System.out.println("Book House: " + getBookHouse());
        System.out.println("Metro: " + getMetro());
        System.out.println("Total books before creation: " + Book.getTotalBooks());
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien");
        System.out.println("Book 1: " + book1.getDescription());
        System.out.println("Book 2: " + book2.getDescription());
        System.out.println("Author of book1: " + book1.getAuthor());
        System.out.println("Total books after creation: " + Book.getTotalBooks());
        System.out.println(book2.hasWordInTitle("The"));
        Book.resetTotalBooks();
        System.out.println(Book.getTotalBooks());
    }
}