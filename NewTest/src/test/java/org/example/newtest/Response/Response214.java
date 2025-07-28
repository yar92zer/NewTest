package org.example.newtest.Response;

public class Response214 {
    public static boolean test214(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 20 && age <= 39
                && salary >= 39000 && salary <= 51000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*
Name: "Андрей"
Age: от 20 до 39
Salary: от 39000 руб до 51000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 7 лет*/