package org.example.newtest.Response;

public class Response952 {
    public static boolean test952(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 21 && age <= 26
                && salary >= 41000 && salary <= 42000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7;
    }
}
/*Name: "Александр"
Age: от 21 до 26
Salary: от 41000 руб до 42000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 7 лет*/