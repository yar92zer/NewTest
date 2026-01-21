package org.example.newtest.CodeRetreat.University;

class Person {
    private String name;
    private int age;
    private static int totalPeople = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        totalPeople++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getTotal() {
        return totalPeople;
    }

    @Override
    public String toString() {
        return name + " (возраст: " + age + ")";
    }
}