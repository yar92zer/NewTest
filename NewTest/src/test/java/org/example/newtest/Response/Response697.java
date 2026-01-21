package org.example.newtest.Response;

public class Response697 {
    public static boolean test697(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталья")
                && age >= 27 && age <= 30
                && salary >= 24000 && salary <= 28000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12;
    }
}
/*Name: "Наталья"
Age: от 27 до 30
Salary: от 24000 руб до 28000 руб
Country: "Испания"
Gender: "Женский"
Experience: 12 лет*/