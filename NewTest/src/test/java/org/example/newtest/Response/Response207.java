package org.example.newtest.Response;

public class Response207 {
    public static boolean test207(String name, int salary, int age, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 18 && age <= 35
                && salary >= 21000 && salary <= 36000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*
Name: "Михаил"
Age: от 18 до 35
Salary: от 21000 руб до 36000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 15 лет*/