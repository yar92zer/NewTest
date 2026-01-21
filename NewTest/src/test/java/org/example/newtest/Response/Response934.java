package org.example.newtest.Response;

public class Response934 {
    public static boolean test934(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Анна")
                && age >= 30 && age <= 53
                && salary >= 40000 && salary <= 47000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6;
    }
}
/*Name: "Анна"
Age: от 30 до 53
Salary: от 40000 руб до 47000 руб
Country: "Италия"
Gender: "Женский"
Experience: 6 лет*/