package org.example.newtest.Response;

public class Response614 {
    public static boolean test614(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 26 && age <= 30
                && salary >= 26000 && salary <= 57000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*
Name: "Наталья"
Age: от 26 до 30
Salary: от 26000 руб до 57000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 11 лет*/
