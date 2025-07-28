package org.example.newtest.Response;

public class Response223 {
    public static boolean test223(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 18 && age <= 62
                && salary >= 31000 && salary <= 32000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*
Name: "Николай"
Age: от 18 до 62
Salary: от 31000 руб до 32000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 15 лет*/