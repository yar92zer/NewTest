package org.example.newtest.Response;

public class Response217 {
    public static boolean test217(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 40 && age <= 50
                && salary >= 34000 && salary <= 42000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*
Name: "Виктория"
Age: от 40 до 50
Salary: от 34000 руб до 42000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 2 года*/