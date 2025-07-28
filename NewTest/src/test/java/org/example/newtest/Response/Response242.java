package org.example.newtest.Response;

public class Response242 {
    public static boolean test242(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 42 && age <= 53
                && salary >= 28000 && salary <= 29000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*
Name: "Дмитрий"
Age: от 42 до 53
Salary: от 28000 руб до 29000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 9 лет*/