package org.example.newtest.Response;

public class Response91 {
    public static boolean test91(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 24 && age <= 35
                && salary >= 29000 && salary <= 33000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 24 до 35
Salary: от 29000 руб до 33000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 1 год*/