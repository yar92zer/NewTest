package org.example.newtest.Response;

public class Response339 {
    public static boolean test339(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 23 && age <= 30
                && salary >= 36000 && salary <= 44000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 23 до 30
Salary: от 36000 руб до 44000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 12 лет*/