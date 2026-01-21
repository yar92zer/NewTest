package org.example.newtest.Response;

public class Response955 {
    public static boolean test955(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Мария")
                && age >= 56 && age <= 61
                && salary >= 24000 && salary < 40000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6;
    }
}
/*Name: "Мария"
Age: от 56 до 61
Salary: от 24000 руб до 40000 руб
Country: "Испания"
Gender: "Женский"
Experience: 6 лет*/