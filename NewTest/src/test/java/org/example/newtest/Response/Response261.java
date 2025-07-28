package org.example.newtest.Response;

public class Response261 {
    public static boolean test261(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 19 && age <= 30
                && salary >= 26000 && salary <= 31000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*
Name: "Мария"
Age: от 19 до 30
Salary: от 26000 руб до 31000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 4 года
*/