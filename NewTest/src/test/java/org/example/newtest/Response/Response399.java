package org.example.newtest.Response;

public class Response399 {
    public static boolean test399(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 18 && age <= 32
                && salary >= 32000 && salary <= 58000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 18 до 32
Salary: от 32000 руб до 58000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 12 лет*/