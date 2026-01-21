package org.example.newtest.CodeRetreat.ZooOOP;

class Animal {
    private String name;
    private int age;
    private boolean isHungry = true;
    private static int totalAnimals = 0;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        totalAnimals++;
    }

    public void feed() {
        isHungry = false;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public String getName() {
        return name;
    }

    public static int getTotal() {
        return totalAnimals;
    }

    @Override
    public String toString() {
        return name + " (" + age + " лет)" + (isHungry ? " [голоден]" : "[сыт]");
    }
}