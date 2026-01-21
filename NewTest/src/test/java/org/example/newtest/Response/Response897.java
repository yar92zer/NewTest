package org.example.newtest.Response;

public class Response897 {
    public static boolean test897(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 50 && age <= 52
                && salary >= 33000 && salary <= 43000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13;
    }
}
/*Name: "Михаил"
Age: от 50 до 52
Salary: от 33000 руб до 43000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 13 лет*/