package org.example.newtest.CodeRetreat.Daily1;

class FictionBook extends Book {
    protected String genre;

    public FictionBook(String title, String author, String genre) throws
            IllegalArgumentException {
        super(title, author);
        if (genre == null || genre.trim().isEmpty())
            throw new IllegalArgumentException("Genre cannot be empty");
        this.genre = genre.trim();
    }
}
