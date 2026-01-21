package org.example.newtest.Response;

public class Response929 {
    public static boolean test929(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 21 && age <= 27
                && salary >= 48000 && salary <= 61000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7;
    }
}
/*Name: "Михаил"
Age: от 21 до 27
Salary: от 48000 руб до 61000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 7 лет*/