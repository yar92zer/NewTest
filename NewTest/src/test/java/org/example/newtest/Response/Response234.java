package org.example.newtest.Response;

public class Response234 {
    public static boolean test234(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 22 && age <= 26
                && salary >= 21000 && salary <= 24000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*
Name: "Андрей"
Age: от 22 до 26
Salary: от 21000 руб до 24000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 7 лет*/