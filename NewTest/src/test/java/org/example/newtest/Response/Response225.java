package org.example.newtest.Response;

public class Response225 {
    public static boolean test225(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 22 && age <= 32
                && salary >= 46000 && salary <= 48000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*
Name: "Екатерина"
Age: от 22 до 32
Salary: от 46000 руб до 48000 руб
Country: "Франция"
Gender: "Женский"
Experience: 6 лет*/