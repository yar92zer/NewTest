package org.example.newtest.Response;

public class Response967 {
    public static boolean test967(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 26 && age <= 30
                && salary >= 34000 && salary <= 42000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5;
    }
}
/*Name: "Максим"
Age: от 26 до 30
Salary: от 34000 руб до 42000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 5 лет*/