package org.example.newtest.Response;

public class Response56 {
    public static boolean test56(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 21 && age <= 25
                && salary >= 56000 && salary <= 60000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 21 до 25
Salary: от 56000 руб до 60000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 1 год*/