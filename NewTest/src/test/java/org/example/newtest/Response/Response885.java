package org.example.newtest.Response;

public class Response885 {
    public static boolean test885(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 27 && age <= 38000
                && salary >= 36000 && salary <= 38000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Максим"
Age: от 27 до 43
Salary: от 36000 руб до 38000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 1 год*/