package org.example.newtest.Response;

public class Response294 {
    public static boolean test294(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 40 && age <= 44
                && salary >= 27000 && salary <= 29000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 40 до 44
Salary: от 27000 руб до 29000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 1 год*/