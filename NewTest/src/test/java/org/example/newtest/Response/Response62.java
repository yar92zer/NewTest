package org.example.newtest.Response;

public class Response62 {
    public static boolean test62(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 30 && age <= 44
                && salary >= 42000 && salary <= 52000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 30 до 44
Salary: от 42000 руб до 52000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 15 ле*/