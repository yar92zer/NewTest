package org.example.newtest.Response;

public class Response334 {
    public static boolean test334(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 26 && age <= 34
                && salary >= 51000 && salary <= 58000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 26 до 34
Salary: от 51000 руб до 58000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 1 год*/