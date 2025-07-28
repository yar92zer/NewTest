package org.example.newtest.Response;

public class Response548 {
    public static boolean test548(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 18 && age <= 22
                && salary >= 42000 && salary <= 48000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 18 до 22
Salary: от 42000 руб до 48000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 1 год*/