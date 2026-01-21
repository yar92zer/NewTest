package org.example.newtest.Response;

public class Response688 {
    public static boolean test688(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 55 && age <= 63
                && salary >= 29000 && salary <= 34000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11;
    }
}
/*Name: "Артем"
Age: от 55 до 63
Salary: от 29000 руб до 34000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 11 лет*/