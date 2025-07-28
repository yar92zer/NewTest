package org.example.newtest.Response;

public class Response254 {
    public static boolean test254(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 18 && age <= 23
                && salary >= 29000 && salary <= 34000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*
Name: "Виктория"
Age: от 18 до 23
Salary: от 29000 руб до 34000 руб
Country: "Германия"
Gender: "Женский"
Experience: 4 года*/