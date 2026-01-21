package org.example.newtest.Response;

public class Response765 {
    public static boolean test765(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Сергей")
                && age >= 34 && age <= 35
                && salary >= 23000 && salary <= 26000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12;
    }
}
/*Name: "Сергей"
Age: от 34 до 35
Salary: от 23000 руб до 26000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 12 лет*/