package org.example.newtest.Response;

public class Response969 {
    public static boolean test969(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 30 && age <= 35
                && salary >= 39000 && salary <= 62000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8;
    }
}
/*Name: "Иван"
Age: от 30 до 35
Salary: от 39000 руб до 62000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 8 лет*/