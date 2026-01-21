package org.example.newtest.CodeRetreat.KingTalsa;

class Worker {
    private String name;
    private int age;
    private static int totalScore = 0;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
        totalScore++;
    }

    public static int getTotal() {
        return totalScore;
    }

    @Override
    public String toString() {
        return "Работник: "+ name +",возраст: "+ age;
    }
}