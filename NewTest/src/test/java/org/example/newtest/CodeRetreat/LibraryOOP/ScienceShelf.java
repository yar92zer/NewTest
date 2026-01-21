package org.example.newtest.CodeRetreat.LibraryOOP;

class ScienceShelf extends Shelf {
    public ScienceShelf() {
        super("Научная литература");
    }

    @Override
    public void display() {
        System.out.println(">>> " + genre + " <<<");
        books.forEach(b -> System.out.println("  • " + b));
    }

    public void addBook(Book b) {
        books.add(b);
    }
}