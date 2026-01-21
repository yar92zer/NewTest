package org.example.newtest.CodeRetreat.Daliy3;

class Person {
    protected String name;

    public Person(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name.trim();
    }

    @Override
    public String toString() {
        return name;
    }
}