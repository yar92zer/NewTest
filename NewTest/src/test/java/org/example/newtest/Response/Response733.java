package org.example.newtest.Response;

public class Response733 {
    public static boolean test733(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Анна")
                && salary >= 53000 && salary <= 61000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 15;
    }
}
/*Name: "Анна"
Age: от 50 до 52
Salary: от 53000 руб до 61000 руб
Country: "Польша"
Gender: "Женский"
Experience: 15 лет*/