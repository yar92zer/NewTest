package org.example.newtest.Response;

public class Response779 {
    public static boolean test779(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 18 && age <= 30
                && salary >= 60000 && salary <= 61000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10;
    }
}
/*Name: "Максим"
Age: от 18 до 30
Salary: от 60000 руб до 61000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 10 лет*/