package org.example.newtest.Response;

public class Response252 {
    public static boolean test252(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 28 && age <= 29
                && salary >= 32000 && salary <= 37000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*
Name: "Михаил"
Age: от 28 до 29
Salary: от 32000 руб до 37000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 10 лет*/