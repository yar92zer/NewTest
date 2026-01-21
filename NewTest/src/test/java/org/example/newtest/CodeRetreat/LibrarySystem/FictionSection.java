package org.example.newtest.CodeRetreat.LibrarySystem;

class FictionSection extends Section {
    public FictionSection() {
        super("Художественная литература");
    }

    @Override
    public void show() {
        System.out.println("=== " + name + " ===");
        books.forEach(b -> System.out.println(" FICTION: " + b));
    }

    public void add(Book b) {
        books.add(b);
    }
}