package org.example.newtest.Response;

public class Response311 {
    public static boolean test311(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 51 && age <= 52
                && salary >= 37000 && salary <= 42000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 51 до 52
Salary: от 37000 руб до 42000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 12 лет*/