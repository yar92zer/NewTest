package org.example.newtest.Response;

public class Response563 {
    public static boolean test563(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 33 && age <= 34
                && salary >= 36000 && salary <= 42000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 33 до 34
Salary: от 36000 руб до 42000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 14 лет*/