package org.example.newtest.Response;

public class Response222 {
    public static boolean test222(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 21 && age <= 23
                && salary >= 36000 && salary <= 45000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*
Name: "Екатерина"
Age: от 21 до 23
Salary: от 36000 руб до 45000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 5 лет*/