package org.example.newtest.Response;

public class Response209 {
    public static boolean test209(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 21 && age <= 28
                && salary >= 27000 && salary <= 35000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*
Name: "Екатерина"
Age: от 21 до 28
Salary: от 27000 руб до 35000 руб
Country: "Испания"
Gender: "Женский"
Experience: 10 лет*/