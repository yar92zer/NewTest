package org.example.newtest.Response;

public class Response749 {
    public static boolean test749(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 23 && age <= 28
                && salary >= 44000 && salary <= 48000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10;
    }
}
/*Name: "Егор"
Age: от 23 до 28
Salary: от 44000 руб до 48000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 10 лет*/