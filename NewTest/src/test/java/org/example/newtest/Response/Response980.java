package org.example.newtest.Response;

public class Response980 {
    public static boolean test980(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 19 && age <= 31
                && salary >= 40000 && salary <= 45000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13;
    }
}
/*Name: "Александр"
Age: от 19 до 31
Salary: от 40000 руб до 45000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 13 лет*/