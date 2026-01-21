package org.example.newtest.CodeRetreat.LibrarySystem;

class Book {
    private String title;
    private String author;
    private boolean borrowed = false;
    private static int total = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        total++;
    }

    public void borrow() {
        borrowed = true;
    }

    public void returnBook() {
        borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "\"" + title + "\"-" + author + (borrowed ? " [ВЫДАНА]" : "[НА МЕСТЕ]");
    }
}