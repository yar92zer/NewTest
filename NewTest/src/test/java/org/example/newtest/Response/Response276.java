package org.example.newtest.Response;

public class Response276 {
    public static boolean test276(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 19 && age <= 21
                && salary >= 25000 && salary <= 40000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*
Name: "Ольга"
Age: от 19 до 21
Salary: от 25000 руб до 40000 руб
Country: "Италия"
Gender: "Женский"
Experience: 3 года*/