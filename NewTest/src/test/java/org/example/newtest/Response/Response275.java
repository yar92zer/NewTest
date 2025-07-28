package org.example.newtest.Response;

public class Response275 {
    public static boolean test275(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 21 && age <= 22
                && salary >= 34000 && salary <= 56000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*
Name: "Егор"
Age: от 21 до 22
Salary: от 34000 руб до 56000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 3 года*/