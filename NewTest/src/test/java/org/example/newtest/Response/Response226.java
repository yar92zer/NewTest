package org.example.newtest.Response;

public class Response226 {
    public static boolean test226(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 19 && age <= 23
                && salary >= 42000 && salary <= 49000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*
Name: "Максим"
Age: от 19 до 23
Salary: от 42000 руб до 49000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 1 год*/