package org.example.newtest.Response;

public class Response813 {
    public static boolean test813(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Мария")
                && age >= 20 && age <= 39
                && salary >= 28000 && salary <= 57000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8;
    }
}
/*Name: "Мария"
Age: от 20 до 39
Salary: от 28000 руб до 57000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 8 лет*/