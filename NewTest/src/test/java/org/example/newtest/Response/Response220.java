package org.example.newtest.Response;

public class Response220 {
    public static boolean test220(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 18 && age <= 22
                && salary >= 20000 && salary <= 52000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*
Name: "Михаил"
Age: от 18 до 22
Salary: от 20000 руб до 52000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 1 год*/