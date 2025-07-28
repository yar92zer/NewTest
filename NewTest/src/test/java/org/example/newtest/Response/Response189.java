package org.example.newtest.Response;

public class Response189 {
    public static boolean test189(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 37 && age <= 42
                && salary >= 27000 && salary <= 39000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 37 до 42
Salary: от 27000 руб до 39000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 11 лет*/