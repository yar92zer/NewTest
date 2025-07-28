package org.example.newtest.Response;

public class Response251 {
    public static boolean test251(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 29 && age <= 35
                && salary >= 35000 && salary <= 61000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*
Name: "Мария"
Age: от 29 до 35
Salary: от 35000 руб до 61000 руб
Country: "Франция"
Gender: "Женский"
Experience: 12 лет*/