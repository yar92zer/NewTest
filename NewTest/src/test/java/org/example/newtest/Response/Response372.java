package org.example.newtest.Response;

public class Response372 {
    public static boolean test372(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 53 && age <= 54
                && salary >= 53000 && salary <= 56000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 53 до 54
Salary: от 53000 руб до 56000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 9 лет*/