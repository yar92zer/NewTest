package org.example.newtest.Response;

public class Response481 {
    public static boolean test481(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 20 && age <= 40
                && salary >= 67000 && salary <= 68000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 20 до 40
Salary: от 67000 руб до 68000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 12 лет*/