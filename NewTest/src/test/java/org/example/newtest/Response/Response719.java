package org.example.newtest.Response;

public class Response719 {
    public static boolean test719(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Екатерина")
                && age >= 23 && age <= 24
                && salary >= 61000 && salary <= 62000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6;
    }
}
/*Name: "Екатерина"
Age: от 23 до 24
Salary: от 61000 руб до 62000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 6 лет*/