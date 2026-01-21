package org.example.newtest.Response;

public class Response611 {
    public static boolean test611(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 31 && age <= 38
                && salary >= 23000 && salary <= 24000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*
Name: "Наталья"
Age: от 31 до 38
Salary: от 23000 руб до 24000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 7 лет*/
