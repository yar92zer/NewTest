package org.example.newtest.CodeRetreat.Daily1;

class Book {
    protected String title;
    protected String author;
    private static int totalBooks = 0;

    public Book(String title, String author) throws IllegalArgumentException {
        if (title == null || title.trim().isEmpty())
            throw new IllegalArgumentException("Title cannot be empty");
        if (author == null || author.trim().isEmpty())
            throw new IllegalArgumentException("Author cannot be empty");
        this.title = title.trim();
        this.author = author.trim();
        totalBooks++;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "'" + title + "by " + author;
    }
}
