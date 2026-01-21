package org.example.newtest.Response;

public class Response601 {
    public static boolean test601(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 26 && age <= 27
                && salary >= 58000 && salary <= 59000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 26 до 27
Salary: от 58000 руб до 59000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 6 лет*/