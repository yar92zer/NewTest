package org.example.newtest.Response;

public class Response911 {
    public static boolean tets911(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 48 && age <= 49
                && salary >= 26000 && salary <= 27000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15;
    }
}
/*Name: "Александр"
Age: от 48 до 49
Salary: от 26000 руб до 27000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 15 лет*/