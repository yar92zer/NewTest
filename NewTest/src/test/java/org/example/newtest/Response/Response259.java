package org.example.newtest.Response;

public class Response259 {
    public static boolean test259(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 37 && age <= 39
                && salary >= 26000 && salary <= 27000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*
Name: "Елена"
Age: от 37 до 39
Salary: от 26000 руб до 27000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 1 год
*/