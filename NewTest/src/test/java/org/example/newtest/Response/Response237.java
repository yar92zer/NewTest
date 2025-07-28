package org.example.newtest.Response;

public class Response237 {
    public static boolean test239(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 29 && age <= 37
                && salary >= 35000 && salary <= 59000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женская")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*
Name: "Мария"
Age: от 29 до 37
Salary: от 35000 руб до 59000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 6 лет*/