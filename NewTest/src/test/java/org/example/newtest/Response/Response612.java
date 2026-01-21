package org.example.newtest.Response;

public class Response612 {
    public static boolean test612(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 58 && age <= 59
                && salary >= 43000 && salary <= 50000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*
Name: "Анна"
Age: от 58 до 59
Salary: от 43000 руб до 50000 руб
Country: "Германия"
Gender: "Женский"
Experience: 10 лет*/
