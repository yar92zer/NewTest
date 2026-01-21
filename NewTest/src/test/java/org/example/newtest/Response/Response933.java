package org.example.newtest.Response;

public class Response933 {
    public static boolean test933(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 21 && age <= 45
                && salary >= 23000 && salary <= 28000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7;
    }
}
/*Name: "Александр"
Age: от 21 до 45
Salary: от 23000 руб до 28000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 7 лет*/