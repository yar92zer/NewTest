package org.example.newtest.Response;

public class Response723 {
    public static boolean test723(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Мария")
                && age >= 38 && age <= 42
                && salary >= 26000 && salary <= 52000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8;
    }
}
/*Name: "Мария"
Age: от 38 до 42
Salary: от 26000 руб до 52000 руб
Country: "Испания"
Gender: "Женский"
Experience: 8 лет*/