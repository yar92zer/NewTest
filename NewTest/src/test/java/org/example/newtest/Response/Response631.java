package org.example.newtest.Response;

public class Response631 {
    public static boolean test631(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 20 && age <= 36
                && salary >= 63000 && salary <= 65000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 20 до 36
Salary: от 63000 руб до 65000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 8 лет*/