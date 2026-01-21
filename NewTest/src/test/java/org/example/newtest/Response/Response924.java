package org.example.newtest.Response;

public class Response924 {
    public static boolean test924(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Виктория")
                && age >= 39 && age <= 43
                && salary >= 43000 && salary <= 48000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9;
    }
}
/*Name: "Виктория"
Age: от 39 до 43
Salary: от 43000 руб до 48000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 9 лет*/