package org.example.newtest.CodeRetreat.LibrarySystem;

import java.util.*;

abstract class Section {
    protected String name;
    protected List<Book> books = new ArrayList<>();

    public Section(String name){this.name = name;}

    public abstract void show();
}