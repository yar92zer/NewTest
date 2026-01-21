package org.example.newtest.Response;

public class Response701 {
    public static boolean test701(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("екатерина")
                && age >= 23 && age <= 24
                && salary >= 42000 && salary <= 49000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4;
    }
}
/*Name: "Екатерина"
Age: от 23 до 24
Salary: от 42000 руб до 49000 руб
Country: "Италия"
Gender: "Женский"
Experience: 4 года*/