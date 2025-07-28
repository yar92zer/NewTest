package org.example.newtest.Response;

public class Response538 {
    public static boolean test538(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 28 && age <= 42
                && salary >= 28000 && salary <= 29000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 28 до 42
Salary: от 28000 руб до 29000 руб
Country: "Франция"
Gender: "Женский"
Experience: 11 лет*/