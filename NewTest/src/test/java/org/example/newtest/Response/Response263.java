package org.example.newtest.Response;

public class Response263 {
    public static boolean test263(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 23 && age <= 24
                && salary >= 49000 && salary <= 50000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*
Name: "Наталья"
Age: от 23 до 24
Salary: от 49000 руб до 50000 руб
Country: "Испания"
Gender: "Женский"
Experience: 4 года*/