package org.example.newtest.Response;

public class Response245 {
    public static boolean test245(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 42 && age <= 65
                && salary >= 21000 && salary <= 38000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*
Name: "Александр"
Age: от 42 до 65
Salary: от 21000 руб до 38000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 9 лет*/