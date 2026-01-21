package org.example.newtest.Response;

public class Response772 {
    public static boolean test772(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 20 && age <= 25
                && salary >= 32000 && salary <= 48000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7;
    }
}
/*Name: "Егор"
Age: от 20 до 25
Salary: от 32000 руб до 48000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 7 лет*/