package org.example.newtest.Response;

public class Response247 {
    public static boolean test247(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 19 && age <= 31
                && salary >= 47000 && salary <= 56000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*
Name: "Ольга"
Age: от 19 до 31
Salary: от 47000 руб до 56000 руб
Country: "Италия"
Gender: "Женский"
Experience: 12 лет*/