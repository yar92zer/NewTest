package org.example.newtest.Response;

public class Response219 {
    public static boolean test219(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 19 && age <= 27
                && salary >= 47000 && salary <= 51000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*
Name: "Светлана"
Age: от 19 до 27
Salary: от 47000 руб до 51000 руб
Country: "Испания"
Gender: "Женский"
Experience: 5 лет*/