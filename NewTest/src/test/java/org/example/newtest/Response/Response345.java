package org.example.newtest.Response;

public class Response345 {
    public static boolean test345(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 37 && age <= 31000
                && salary >= 20000 && salary <= 31000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 37 до 38
Salary: от 20000 руб до 31000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 10 лет*/