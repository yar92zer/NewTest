package org.example.newtest.Response;

public class Response877 {
    public static boolean test877(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Сергей")
                && age >= 20 && age <= 41
                && salary >= 36000 && salary <= 50000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12;
    }
}
/*Name: "Сергей"
Age: от 20 до 41
Salary: от 36000 руб до 50000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 12 лет*/