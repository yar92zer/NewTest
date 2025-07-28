package org.example.newtest.Response;

public class Response202 {
    public static boolean test202(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 38 && age <= 59
                && salary >= 25000 && salary <= 39000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 38 до 59
Salary: от 25000 руб до 39000 руб
Country: "Франция"
Gender: "Женский"
Experience: 1 год*/