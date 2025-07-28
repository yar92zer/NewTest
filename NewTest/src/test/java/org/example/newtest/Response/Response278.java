package org.example.newtest.Response;

public class Response278 {
    public static boolean test278(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 19 && age <= 32
                && salary >= 45000 && salary <= 50000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*
Name: "Николай"
Age: от 19 до 32
Salary: от 45000 руб до 50000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 9 лет*/