package org.example.newtest.Response;

public class Response257 {
    public static boolean test257(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 20 && age <= 21
                && salary >= 24000 && salary <= 40000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*
Name: "Екатерина"
Age: от 20 до 21
Salary: от 24000 руб до 40000 руб
Country: "Италия"
Gender: "Женский"
Experience: 1 год
*/