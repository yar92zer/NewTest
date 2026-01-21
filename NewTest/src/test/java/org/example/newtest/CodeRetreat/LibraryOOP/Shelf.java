package org.example.newtest.CodeRetreat.LibraryOOP;

import java.util.ArrayList;
import java.util.List;

abstract class Shelf {
    protected String genre;
    protected List<Book> books = new ArrayList<>();

    public Shelf(String genre) {this.genre = genre;}

    public abstract void display();
}
