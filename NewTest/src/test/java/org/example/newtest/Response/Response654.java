package org.example.newtest.Response;

public class Response654 {
    public static boolean test654(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 31 && age <= 42
                && salary >= 24000 && salary <= 32000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11;
    }
}
/*Name: "Максим"
Age: от 31 до 42
Salary: от 24000 руб до 32000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 11 лет*/