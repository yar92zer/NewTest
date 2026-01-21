package org.example.newtest.Response;

public class Response948 {
    public static boolean test948(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 31 && age <= 34
                && salary >= 28000 && salary <= 29000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7;
    }
}
/*Name: "Михаил"
Age: от 31 до 34
Salary: от 28000 руб до 29000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 7 лет*/