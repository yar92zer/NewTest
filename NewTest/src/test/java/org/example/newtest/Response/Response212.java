package org.example.newtest.Response;

public class Response212 {
    public static boolean test212(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 35 && age <= 50
                && salary >= 32000 && salary <= 33000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*
Name: "Алина"
Age: от 35 до 50
Salary: от 32000 руб до 33000 руб
Country: "Италия"
Gender: "Женский"
Experience: 11 лет*/