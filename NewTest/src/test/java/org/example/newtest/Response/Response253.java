package org.example.newtest.Response;

public class Response253 {
    public static boolean test253(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 21 && age <= 22
                && salary >= 26000 && salary <= 38000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Светлана")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*
Name: "Светлана"
Age: от 21 до 23
Salary: от 26000 руб до 38000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 5 лет*/