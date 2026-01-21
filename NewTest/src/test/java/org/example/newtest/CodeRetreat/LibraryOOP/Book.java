package org.example.newtest.CodeRetreat.LibraryOOP;

class Book {
    private String title;
    private String author;
    private boolean available = true;
    private static int totatlBooks = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        totatlBooks++;
    }

    public void borrow() {
        available = false;
    }

    public void returnBook() {
        available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getAuthor() {
        return author;
    }

    public static int getTotalBooks() {
        return totatlBooks;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + (available ? " [доступна]" : " [выдана]");
    }
}