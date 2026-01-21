package org.example.newtest.Response;

public class Response1001 {
    public static boolean teest1001(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Юлия")
                && age >= 19 && age <= 20
                && salary >= 55000 && salary <= 61000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*
Name: "Юлия"
Age: от 19 до 20
Salary: от 55000 руб до 61000 руб
Country: "Польша"
Gender: "Женский"
Experience: 2 года*/