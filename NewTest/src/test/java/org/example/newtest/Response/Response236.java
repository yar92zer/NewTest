package org.example.newtest.Response;

public class Response236 {
    public static boolean test236(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 22 && age <= 33
                && salary >= 21000 && salary <= 47000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*
Name: "Артем"
Age: от 22 до 33
Salary: от 21000 руб до 47000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 4 года*/