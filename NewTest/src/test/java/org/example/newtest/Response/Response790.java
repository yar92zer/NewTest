package org.example.newtest.Response;

public class Response790 {
    public static boolean test790(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталья")
                && age >= 39 && age <= 44
                && salary >= 22000 && salary <= 27000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8;
    }
}
/*Name: "Наталья"
Age: от 39 до 44
Salary: от 22000 руб до 27000 руб
Country: "Испания"
Gender: "Женский"
Experience: 8 лет*/