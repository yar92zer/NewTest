package org.example.newtest.Response;

public class Response913 {
    public static boolean test913(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Сергей")
                && age >= 34 && age <= 36
                && salary >= 24000 && salary <= 38000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Сергей"
Age: от 34 до 36
Salary: от 24000 руб до 38000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 1 год*/