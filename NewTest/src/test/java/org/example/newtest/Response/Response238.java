package org.example.newtest.Response;

public class Response238 {
    public static boolean test238(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 18 && age <= 35
                && salary >= 29000 && salary <= 42000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*
Name: "Александр"
Age: от 18 до 35
Salary: от 29000 руб до 42000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 2 года*/