package org.example.newtest.Response;

public class Response716 {
    public static boolean test716(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 24 && age <= 29
                && salary >= 52000 && salary <= 53000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6;
    }
}
/*Name: "Егор"
Age: от 24 до 29
Salary: от 52000 руб до 53000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 6 лет*/