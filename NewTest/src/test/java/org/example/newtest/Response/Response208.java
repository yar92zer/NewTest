package org.example.newtest.Response;

public class Response208 {
    public static boolean test208(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 29 && age <= 32
                && salary >= 29000 && salary <= 44000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*
Name: "Иван"
Age: от 29 до 32
Salary: от 29000 руб до 44000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 12 лет*/