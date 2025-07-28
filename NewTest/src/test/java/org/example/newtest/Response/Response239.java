package org.example.newtest.Response;

public class Response239 {
    public static boolean test239(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 31 && age <= 32
                && salary >= 28000 && salary <= 44000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*
Name: "Андрей"
Age: от 31 до 32
Salary: от 28000 руб до 44000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 13 лет*/