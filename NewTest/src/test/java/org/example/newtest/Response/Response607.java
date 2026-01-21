package org.example.newtest.Response;

public class Response607 {
    public static boolean test607(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 20 && age <= 22
                && salary >= 20 && salary <= 22
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мжской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*
Name: "Егор"
Age: от 20 до 22
Salary: от 21000 руб до 22000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 2 года*/
