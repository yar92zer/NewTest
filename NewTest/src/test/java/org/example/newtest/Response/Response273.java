package org.example.newtest.Response;

public class Response273 {
    public static boolean test273(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 19 && age <= 31
                && salary >= 33000 && salary <= 36000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*
Name: "Артем"
Age: от 19 до 31
Salary: от 33000 руб до 36000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 3 года*/