package org.example.newtest.Response;

public class Response993 {
    public static boolean test993(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 24 && age <= 35
                && salary >= 37000 && salary <= 48000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8;
    }
}
/*Name: "Александр"
Age: от 24 до 35
Salary: от 37000 руб до 48000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 8 лет*/