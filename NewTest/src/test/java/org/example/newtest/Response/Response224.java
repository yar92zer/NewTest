package org.example.newtest.Response;

public class Response224 {
    public static boolean test224(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 26 && age <= 31
                && salary >= 39000 && salary <= 53000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*
Name: "Сергей"
Age: от 26 до 31
Salary: от 39000 руб до 53000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 9 лет*/