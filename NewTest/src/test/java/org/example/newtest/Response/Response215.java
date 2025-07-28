package org.example.newtest.Response;

public class Response215 {
    public static boolean test215(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 22 && age <= 25
                && salary >= 23000 && salary <= 54000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*
Name: "Андрей"
Age: от 22 до 25
Salary: от 23000 руб до 54000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 5 лет*/