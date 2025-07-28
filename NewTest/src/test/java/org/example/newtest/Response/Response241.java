package org.example.newtest.Response;

public class Response241 {
    public static boolean test241(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 19 && age <= 23
                && salary >= 39000 && salary <= 51000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*
Name: "Егор"
Age: от 19 до 23
Salary: от 39000 руб до 51000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 1 год*/