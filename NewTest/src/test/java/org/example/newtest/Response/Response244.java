package org.example.newtest.Response;

public class Response244 {
    public static boolean test244(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 21 && age <= 25
                && salary >= 37000 && salary <= 48000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*
Name: "Елена"
Age: от 21 до 25
Salary: от 37000 руб до 48000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 5 лет*/