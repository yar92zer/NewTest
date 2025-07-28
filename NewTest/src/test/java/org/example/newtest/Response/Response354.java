package org.example.newtest.Response;

public class Response354 {
    public static boolean test354(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 25 && age <= 29
                && salary >= 24000 && salary <= 25000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 25 до 29
Salary: от 24000 руб до 25000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 8 лет*/