package org.example.newtest.Response;

public class Response233 {
    public static boolean test233(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 25 && age <= 26
                && salary >= 29000 && salary <= 43000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*
Name: "Екатерина"
Age: от 25 до 26
Salary: от 29000 руб до 43000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 5 лет*/