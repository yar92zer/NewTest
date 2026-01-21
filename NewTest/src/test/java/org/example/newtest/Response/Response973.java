package org.example.newtest.Response;

public class Response973 {
    public static boolean test973(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Сергей")
                && age >= 54 && age <= 56
                && salary >= 27000 && salary <= 50000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11;
    }
}
/*Name: "Сергей"
Age: от 54 до 56
Salary: от 27000 руб до 50000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 11 лет*/