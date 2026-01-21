package org.example.newtest.Response;

public class Response920 {
    public static boolean test920(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 28 && age <= 43
                && salary >= 31000 && salary <= 39000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9;
    }
}
/*Name: "Егор"
Age: от 28 до 43
Salary: от 31000 руб до 39000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 9 лет*/