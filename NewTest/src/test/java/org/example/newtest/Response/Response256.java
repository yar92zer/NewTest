package org.example.newtest.Response;


public class Response256 {
    public static boolean test2569(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 57000 && age <= 61000
                && salary >= 57000 && salary <= 61000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*
Name: "Ольга"
Age: от 19 до 22
Salary: от 57000 руб до 61000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 1 год
*/