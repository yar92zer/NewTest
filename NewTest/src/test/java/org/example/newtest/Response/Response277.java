package org.example.newtest.Response;

public class Response277 {
    public static boolean test277(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 56 && age <= 57
                && salary >= 22000 && salary <= 23000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*
Name: "Елена"
Age: от 56 до 57
Salary: от 22000 руб до 23000 руб
Country: "Польша"
Gender: "Женский"
Experience: 1 год*/