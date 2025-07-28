package org.example.newtest.Response;

public class Response427 {
    public static boolean test427(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 32 && age <= 36
                && salary >= 27000 && salary <= 28000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 32 до 36
Salary: от 27000 руб до 28000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 8 лет*/