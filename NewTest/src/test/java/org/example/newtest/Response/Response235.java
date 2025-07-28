package org.example.newtest.Response;

public class Response235 {
    public static boolean test235(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 22 && age <= 23
                && salary >= 23000 && salary <= 27000
                && country.equalsIgnoreCase("Польща")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*
Name: "Виктория"
Age: от 22 до 23
Salary: от 23000 руб до 27000 руб
Country: "Польша"
Gender: "Женский"
Experience: 1 год*/