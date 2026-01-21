package org.example.newtest.Response;

public class Response660 {
    public static boolean test660(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Сергей")
                && age >= 37 && age <= 42
                && salary >= 30000 && salary <= 32000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8;
    }
}
/*Name: "Сергей"
Age: от 37 до 42
Salary: от 30000 руб до 32000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 8 лет*/