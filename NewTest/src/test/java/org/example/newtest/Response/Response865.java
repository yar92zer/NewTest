package org.example.newtest.Response;

public class Response865 {
    public static boolean test865(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 24 && age <= 25
                && salary >= 49000 && salary <= 62000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5;
    }
}
/*Name: "Максим"
Age: от 24 до 25
Salary: от 49000 руб до 62000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 5 лет*/