package org.example.newtest.Response;

public class Response271 {
    public static boolean test271(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 27 && age <= 44
                && salary >= 27000 && salary <= 61000
                && country.equalsIgnoreCase("Нидерладны")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*
Name: "Анна"
Age: от 27 до 44
Salary: от 27000 руб до 61000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 13 лет*/