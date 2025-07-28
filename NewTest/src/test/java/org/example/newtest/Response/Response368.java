package org.example.newtest.Response;

public class Response368 {
    public static boolean test368(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 27 && age <= 40
                && salary >= 40000 && salary <= 48000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 27 до 40
Salary: от 40000 руб до 48000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 10 лет*/