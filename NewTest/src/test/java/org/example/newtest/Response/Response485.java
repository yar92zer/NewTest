package org.example.newtest.Response;

public class Response485 {
    public static boolean test485(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 42 && age <= 64
                && salary >= 31000 && salary <= 40000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 42 до 64
Salary: от 31000 руб до 40000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 9 лет*/