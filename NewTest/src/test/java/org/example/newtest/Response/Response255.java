package org.example.newtest.Response;

public class Response255 {
    public static boolean test255(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 22 && age <= 26
                && salary >= 33000 && salary <= 51000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*
Name: "Екатерина"
Age: от 22 до 26
Salary: от 33000 руб до 51000 руб
Country: "Франция"
Gender: "Женский"
Experience: 5 лет*/