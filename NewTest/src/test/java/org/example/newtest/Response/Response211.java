package org.example.newtest.Response;

public class Response211 {
    public static boolean test211(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 21 && age <= 40
                && salary >= 28000 && salary <= 33000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*
Name: "Иван"
Age: от 21 до 40
Salary: от 28000 руб до 33000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 14 лет*/