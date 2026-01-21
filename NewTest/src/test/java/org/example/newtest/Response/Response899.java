package org.example.newtest.Response;

public class Response899 {
    public static boolean test899(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 38 && age <= 39
                && salary >= 48000 && salary <= 56000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10;
    }
}
/*Name: "Иван"
Age: от 38 до 39
Salary: от 48000 руб до 56000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 10 лет*/