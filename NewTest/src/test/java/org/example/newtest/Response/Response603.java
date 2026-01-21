package org.example.newtest.Response;

public class Response603 {
    public static boolean test603(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 23 && age <= 24
                && salary >= 27000 && salary <= 43000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 23 до 24
Salary: от 27000 руб до 43000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 6 лет*/