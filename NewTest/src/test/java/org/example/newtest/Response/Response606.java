package org.example.newtest.Response;

public class Response606 {
    public static boolean test606(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 26 && age <= 34
                && salary >= 21000 && salary <= 34000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*
Name: "Наталья"
Age: от 26 до 34
Salary: от 21000 руб до 34000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 2 года*/
