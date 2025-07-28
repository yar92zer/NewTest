package org.example.newtest.Response;

public class Response138 {
    public static boolean test138(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 22 && age <= 32
                && salary >= 22000 && salary <= 34000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 22 до 32
Salary: от 22000 руб до 34000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 10 лет*/