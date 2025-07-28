package org.example.newtest.Response;

public class Response274 {
    public static boolean test274(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 32 && age <= 46
                && salary >= 32000 && salary <= 51000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*
Name: "Иван"
Age: от 32 до 46
Salary: от 32000 руб до 51000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 7 лет*/