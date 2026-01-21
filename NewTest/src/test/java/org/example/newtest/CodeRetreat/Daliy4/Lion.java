package org.example.newtest.CodeRetreat.Daliy4;

class Lion extends Mammal {
    private int feedCount = 0;

    public Lion(String name, int age) {
        super(name, age);
    }

    public void feed() {
        feedCount++;
    }

    public boolean isHungry() {
        return feedCount < 2;
    }

    @Override
    public String toString() {
        return "Lion: " + name + " (age: " + age + "), Hungry: " + (isHungry() ? "Yes" : "No");
    }
}