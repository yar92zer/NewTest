package org.example.newtest.Response;

public class Response116 {
    public static boolean test116(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 22 && age <= 25
                && salary >= 33000 && salary <= 51000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 22 до 25
Salary: от 33000 руб до 51000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 6 лет*/