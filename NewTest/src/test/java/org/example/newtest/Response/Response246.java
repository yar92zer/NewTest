package org.example.newtest.Response;

public class Response246 {
    public static boolean test246(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 33 && age <= 34
                && salary >= 28000 && salary <= 64000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*
Name: "Александр"
Age: от 33 до 34
Salary: от 28000 руб до 64000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 13 лет*/