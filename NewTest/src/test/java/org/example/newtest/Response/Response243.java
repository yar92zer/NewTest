package org.example.newtest.Response;

public class Response243 {
    public static boolean test243(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 22 && age <= 38
                && salary >= 23000 && salary <= 42000
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
Age: от 22 до 38
Salary: от 23000 руб до 42000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 2 года*/