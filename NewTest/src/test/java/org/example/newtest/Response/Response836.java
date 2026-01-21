package org.example.newtest.Response;

public class Response836 {
    public static boolean test836(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 39 && age <= 45
                && salary >= 22000 && salary <= 36000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7;
    }
}
/*Name: "Александр"
Age: от 39 до 45
Salary: от 22000 руб до 36000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 7 лет*/