package org.example.newtest.Response;

public class Response610 {
    public static boolean test610(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктрория")
                && age >= 47 && age <= 50
                && salary >= 61000 && salary <= 63000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*
Name: "Виктория"
Age: от 47 до 50
Salary: от 61000 руб до 63000 руб
Country: "Германия"
Gender: "Женский"
Experience: 4 года*/
