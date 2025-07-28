package org.example.newtest.Response;

public class Response536 {
    public static boolean test536(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 23 && age <= 29
                && salary >= 55000 && salary <= 63000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 23 до 29
Salary: от 55000 руб до 63000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 10 лет*/