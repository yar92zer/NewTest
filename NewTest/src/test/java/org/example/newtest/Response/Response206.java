package org.example.newtest.Response;

public class Response206 {
    public static boolean test206(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Испания")
                && age >= 26 && age <= 29
                && salary >= 20000 && salary <= 34000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*
Name: "Елена"
Age: от 26 до 29
Salary: от 20000 руб до 34000 руб
Country: "Испания"
Gender: "Женский"
Experience: 4 года*/