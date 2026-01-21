package org.example.newtest.Response;

public class Response605 {
    public static boolean test605(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 24 && age <= 43
                && salary >= 35000 && salary <= 51000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 24 до 43
Salary: от 35000 руб до 51000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 14 лет*/