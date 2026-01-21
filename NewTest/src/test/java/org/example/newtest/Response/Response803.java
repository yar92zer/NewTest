package org.example.newtest.Response;

public class Response803 {
    public static boolean test803(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 22 && age <= 55
                && salary >= 29000 && salary <= 55000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7;
    }
}
/*Name: "Максим"
Age: от 22 до 55
Salary: от 29000 руб до 55000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 7 лет*/