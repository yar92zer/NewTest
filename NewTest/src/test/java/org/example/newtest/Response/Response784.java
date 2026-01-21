package org.example.newtest.Response;

public class Response784 {
    public static boolean test784(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 40 && age <= 41
                && salary >= 51000 && salary <= 63000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8;
    }
}
/*Name: "Михаил"
Age: от 40 до 41
Salary: от 51000 руб до 63000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 8 лет*/