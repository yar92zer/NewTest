package org.example.newtest.Response;

public class Response787 {
    public static boolean test787(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталия")
                && age >= 36 && age <= 48
                && salary >= 56000 && salary <= 62000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5;
    }
}
/*Name: "Наталья"
Age: от 36 до 48
Salary: от 56000 руб до 62000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 5 лет*/