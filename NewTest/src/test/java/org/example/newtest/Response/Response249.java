package org.example.newtest.Response;

public class Response249 {
    public static boolean test249(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 35 && age <= 42
                && salary >= 30000 && salary <= 44000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*
Name: "Екатерина"
Age: от 35 до 42
Salary: от 30000 руб до 44000 руб
Country: "Германия"
Gender: "Женский"
Experience: 2 года*/