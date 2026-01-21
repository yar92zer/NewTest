package org.example.newtest.CodeRetreat.Daliy4;

class Animal {
    protected String name;
    protected int age;
    private static int totalAnimals = 0;

    public Animal(String name, int age) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.name = name.trim();
        this.age = age;
        totalAnimals++;
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (age: " + age + ")";
    }
}