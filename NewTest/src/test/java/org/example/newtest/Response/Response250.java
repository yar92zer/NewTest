package org.example.newtest.Response;

public class Response250 {
    public static boolean test250(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталия")
                && age >= 18 && age <= 25
                && salary >= 32000 && salary <= 34000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*
Name: "Наталья"
Age: от 18 до 25
Salary: от 32000 руб до 34000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 1 год*/