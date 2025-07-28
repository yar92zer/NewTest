package org.example.newtest.Response;

public class Response230 {
    public static boolean test230(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 31 && age <= 38
                && salary >= 28000 && salary <= 64000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*
Name: "Анна"
Age: от 31 до 38
Salary: от 28000 руб до 64000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 9 лет*/