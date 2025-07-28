package org.example.newtest.Response;

public class Response216 {
    public static boolean test216(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 25 && age <= 34
                && salary >= 35000 && salary <= 70000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*
Name: "Наталья"
Age: от 25 до 34
Salary: от 35000 руб до 70000 руб
Country: "Италия"
Gender: "Женский"
Experience: 3 года*/