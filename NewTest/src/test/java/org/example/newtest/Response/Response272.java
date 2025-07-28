package org.example.newtest.Response;

public class Response272 {
    public static boolean test272(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 27 && age <= 29
                && salary >= 21000 && salary <= 36000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*
Name: "Андрей"
Age: от 27 до 29
Salary: от 21000 руб до 36000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 7 лет*/