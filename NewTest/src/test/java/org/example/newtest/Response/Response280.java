package org.example.newtest.Response;

public class Response280 {
    public static boolean test280(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатериа")
                && age >= 47 && age <= 51
                && salary >= 39000 && salary <= 40000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*
Name: "Екатерина"
Age: от 47 до 51
Salary: от 39000 руб до 40000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 9 лет*/