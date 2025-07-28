package org.example.newtest.Response;

public class Response258 {
    public static boolean test258(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 27 && age <= 33
                && salary >= 30000 && salary <= 43000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*
Name: "Екатерина"
Age: от 27 до 33
Salary: от 30000 руб до 43000 руб
Country: "Германия"
Gender: "Женский"
Experience: 7 лет*/