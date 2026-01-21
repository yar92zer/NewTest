package org.example.newtest.Response;

public class Response613 {
    public static boolean test613(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 39 && age <= 46
                && salary >= 27000 && salary <= 59000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*
Name: "Егор"
Age: от 39 до 46
Salary: от 27000 руб до 59000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 14 лет*/
