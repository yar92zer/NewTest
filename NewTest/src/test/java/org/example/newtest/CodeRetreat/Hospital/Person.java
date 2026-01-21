package org.example.newtest.CodeRetreat.Hospital;

class Person {
    protected String name;
    protected int age;
    private static int totalPeople = 0;

    public Person(String name, int age) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name empty");
        if (age < 0) throw new IllegalArgumentException("Age negative");
        this.name = name;
        this.age = age;
        totalPeople++;
    }

    public static int getTotal() {
        return totalPeople;
    }

    @Override
    public String toString() {
        return name + " (age" + age + ")";
    }
}