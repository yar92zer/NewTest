package org.example.newtest.Response;

public class Response139 {
    public static boolean test139(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Лера")
                && age >= 37 && age <= 44
                && salary >= 20000 && salary <= 29000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*
Name: "Лера"
Age: от 37 до 44
Salary: от 20000 руб до 29000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 15 лет*/