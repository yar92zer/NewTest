package org.example.newtest.Response;

public class Response210 {
    public static boolean test210(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 18 && age <= 25
                && salary >= 45000 && salary <= 58000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*
Name: "Андрей"
Age: от 18 до 25
Salary: от 45000 руб до 58000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 7 лет*/