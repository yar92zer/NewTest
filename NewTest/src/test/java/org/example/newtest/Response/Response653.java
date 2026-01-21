package org.example.newtest.Response;

public class Response653 {
    public static boolean test653(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Андрей")
                && age >= 39 && age <= 40
                && salary >= 61000 && salary <= 62000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15;
    }
}
/*Name: "Андрей"
Age: от 39 до 40
Salary: от 61000 руб до 62000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 15 лет*/