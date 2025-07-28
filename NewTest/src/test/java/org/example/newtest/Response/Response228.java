package org.example.newtest.Response;

public class Response228 {
    public static boolean test228(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 31 && age <= 33
                && salary >= 27000 && salary <= 33000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*
Name: "Александр"
Age: от 31 до 33
Salary: от 27000 руб до 33000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 11 лет*/