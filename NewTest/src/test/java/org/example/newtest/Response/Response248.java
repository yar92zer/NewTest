package org.example.newtest.Response;

public class Response248 {
    public static boolean test248(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 18 && age <= 27
                && salary >= 26000 && salary <= 33000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*
Name: "Александр"
Age: от 18 до 27
Salary: от 26000 руб до 33000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 8 лет*/