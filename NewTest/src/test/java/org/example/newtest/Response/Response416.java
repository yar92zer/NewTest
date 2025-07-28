package org.example.newtest.Response;

public class Response416 {
    public static boolean test416(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 25 && age <= 30
                && salary >= 38000 && salary <= 45000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 25 до 30
Salary: от 38000 руб до 45000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 5 лет*/