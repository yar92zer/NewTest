package org.example.newtest.CodeRetreat.LibraryOOP;

class FictionShelf extends Shelf {
    public FictionShelf(){ super("Художественная литература");}

    @Override
    public void display(){
        System.out.println("=== " + genre + " ===");
        books.forEach(System.out::println);
    }
    public void addBook(Book b){ books.add(b); }
}
