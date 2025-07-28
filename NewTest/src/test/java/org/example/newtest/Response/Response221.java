package org.example.newtest.Response;

public class Response221 {
    public static boolean test221(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 19 && age <= 25
                && salary >= 28000 && salary <= 42000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*
Name: "Елена"
Age: от 19 до 25
Salary: от 28000 руб до 42000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 1 год*/