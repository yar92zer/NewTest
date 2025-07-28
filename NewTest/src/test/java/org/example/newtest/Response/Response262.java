package org.example.newtest.Response;

public class Response262 {
    public static boolean test262(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 27 && age <= 28
                && salary >= 36000 && salary <= 37000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*
Name: "Мария"
Age: от 27 до 28
Salary: от 36000 руб до 37000 руб
Country: "Польша"
Gender: "Женский"
Experience: 4 года*/