package org.example.newtest.Response;

public class Response608 {
    public static boolean test608(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 23 && age <= 32
                && salary >= 21000 && salary <= 40000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*
Name: "Андрей"
Age: от 23 до 32
Salary: от 21000 руб до 40000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 9 лет*/
