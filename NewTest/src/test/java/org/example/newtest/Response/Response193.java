package org.example.newtest.Response;

public class Response193 {
    public static boolean test193(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 34 && age <= 35
                && salary >= 25000 && salary <= 39000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 34 до 35
Salary: от 25000 руб до 39000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 10 лет*/