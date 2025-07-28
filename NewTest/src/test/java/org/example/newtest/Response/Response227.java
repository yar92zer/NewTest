package org.example.newtest.Response;

public class Response227 {
    public static boolean test227(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 27 && age <= 37
                && salary >= 36000 && salary <= 42000
                && country.equalsIgnoreCase("Женский")
                && gender.equalsIgnoreCase("Нидерланды")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*
Name: "Юлия"
Age: от 27 до 37
Salary: от 36000 руб до 42000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 2 года*/