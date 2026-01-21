package org.example.newtest.CodeRetreat.LibrarySystem;

class ScienceSection extends Section {
    public ScienceSection() {
        super("Научна литература");
    }

    @Override
    public void show() {
        System.out.println(">>> " + name + " <<<");
        books.forEach(b -> System.out.println(" SCIENCE: " + b));
    }

    public void add(Book b) {
        books.add(b);
    }
}