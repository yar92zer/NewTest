package org.example.newtest.Response;

public class Response874 {
    public static boolean test874(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 18 && age <= 25
                && salary >= 29000 && salary <= 32000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Иван"
Age: от 18 до 25
Salary: от 29000 руб до 32000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 1 год*/