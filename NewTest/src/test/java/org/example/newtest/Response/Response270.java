package org.example.newtest.Response;

public class Response270 {
    public static boolean test270(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 27 && age <= 42
                && salary >= 37000 && salary <= 51000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 27 до 42
Salary: от 37000 руб до 51000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 8 лет*/