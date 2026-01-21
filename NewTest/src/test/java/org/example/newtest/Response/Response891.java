package org.example.newtest.Response;

public class Response891 {
    public static boolean test891(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Виктория")
                && age >= 23 && age <= 24
                && salary >= 50000 && salary <= 62000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5;
    }
}
/*Name: "Виктория"
Age: от 23 до 24
Salary: от 50000 руб до 62000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 5 лет*/