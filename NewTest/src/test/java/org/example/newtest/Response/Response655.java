package org.example.newtest.Response;

public class Response655 {
    public static boolean test655(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Андрей")
                && age >= 19 && age <= 41
                && salary >= 62000 && salary <= 66000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4;
    }
}
/*Name: "Андрей"
Age: от 19 до 41
Salary: от 62000 руб до 66000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 4 года*/