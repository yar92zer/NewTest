package org.example.newtest.Response;

public class Response946 {
    public static boolean test946(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Мария")
                && age >= 26 && age <= 34
                && salary >= 25000 && salary <= 33000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5;
    }
}
/*Name: "Мария"
Age: от 26 до 34
Salary: от 25000 руб до 33000 руб
Country: "Франция"
Gender: "Женский"
Experience: 5 лет*/