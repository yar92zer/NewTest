package org.example.newtest.Response;

public class Response279 {
    public static boolean test279(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 25 && age <= 34
                && salary >= 40000 && salary <= 44000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*
Name: "Алина"
Age: от 25 до 34
Salary: от 40000 руб до 44000 руб
Country: "Испания"
Gender: "Женский"
Experience: 6 лет*/