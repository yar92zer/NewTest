package org.example.newtest.Response;

public class Response229 {
    public static boolean test229(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 22 && age <= 36
                && salary >= 22000 && salary <= 33000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*
Name: "Николай"
Age: от 22 до 36
Salary: от 22000 руб до 33000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 11 лет*/