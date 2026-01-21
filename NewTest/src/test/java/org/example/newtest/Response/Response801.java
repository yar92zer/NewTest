package org.example.newtest.Response;

public class Response801 {
    public static boolean test801(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Сергей")
                && age >= 39 && age <= 43
                && salary >= 32000 && salary <= 44000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5;
    }
}
/*Name: "Сергей"
Age: от 39 до 43
Salary: от 32000 руб до 44000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 5 лет*/