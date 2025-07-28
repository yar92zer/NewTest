package org.example.newtest.Response;

public class Response404 {
    public static boolean test404(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 42 && age <= 48
                && salary >= 50000 && salary <= 62000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 42 до 48
Salary: от 50000 руб до 62000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 4 года*/