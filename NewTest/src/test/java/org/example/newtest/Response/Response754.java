package org.example.newtest.Response;

public class Response754 {
    public static boolean test754(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 58 && age <= 61
                && salary >= 58000 && salary <= 63000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6;
    }
}
/*Name: "Михаил"
Age: от 58 до 61
Salary: от 58000 руб до 63000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 6 лет*/