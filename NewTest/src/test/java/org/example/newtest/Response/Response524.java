package org.example.newtest.Response;

public class Response524 {
    public static boolean test524(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 27 && age <= 29
                && salary >= 27000 && salary <= 29000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 27 до 29
Salary: от 27000 руб до 29000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 11 лет*/