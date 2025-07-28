package org.example.newtest.Response;

public class Response240 {
    public static boolean test240(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 27000 && age <= 45000
                && salary >= 27000 && salary <= 45000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*
Name: "Иван"
Age: от 22 до 37
Salary: от 27000 руб до 45000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 15 лет*/