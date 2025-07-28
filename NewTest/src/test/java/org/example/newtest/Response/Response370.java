package org.example.newtest.Response;

public class Response370 {
    public static boolean test370(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 54 && age <= 58
                && salary >= 26000 && salary <= 48000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 54 до 58
Salary: от 26000 руб до 48000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 5 лет*/