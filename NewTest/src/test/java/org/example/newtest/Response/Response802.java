package org.example.newtest.Response;

public class Response802 {
    public static boolean test802(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 22 && age <= 23
                && salary >= 24000 && salary <= 47000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5;
    }
}
/*Name: "Егор"
Age: от 22 до 23
Salary: от 24000 руб до 47000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 5 лет*/