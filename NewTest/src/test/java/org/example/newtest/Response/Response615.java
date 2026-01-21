package org.example.newtest.Response;

public class Response615 {
    public static boolean test615(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елезавета")
                && age >= 20 && age <= 28
                && salary >= 50000 && salary <= 53000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*
Name: "Елизавета"
Age: от 20 до 28
Salary: от 50000 руб до 53000 руб
Country: "Италия"
Gender: "Женский"
Experience: 8 лет*/
