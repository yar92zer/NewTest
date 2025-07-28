package org.example.newtest.Response;

public class Response231 {
    public static boolean test231(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 29 && age <= 35
                && salary >= 25000 && salary <= 30000
                && country.equalsIgnoreCase("Италия")
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
Salary: от 25000 руб до 30000 руб
Country: "Италия"
Gender: "Женский"
Experience: 12 лет*/