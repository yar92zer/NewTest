package org.example.newtest.Response;

public class Response783 {
    public static boolean test783(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 21 && age <= 43
                && salary >= 24000 && salary <= 48000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13;
    }
}
/*Name: "Алина"
Age: от 21 до 43
Salary: от 24000 руб до 48000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 13 лет*/