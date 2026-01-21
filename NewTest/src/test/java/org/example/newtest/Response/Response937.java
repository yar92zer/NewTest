package org.example.newtest.Response;

public class Response937 {
    public static boolean test937(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Сергей")
                && age >= 31 && age <= 34
                && salary >= 37000 && salary <= 38000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10;
    }
}
/*Name: "Сергей"
Age: от 31 до 34
Salary: от 37000 руб до 38000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 10 лет*/