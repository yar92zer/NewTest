package org.example.newtest.Response;

public class Response735 {
    public static boolean test735(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 24 && age <= 52
                && salary >= 23000 && salary <= 330000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6;
    }
}
/*Name: "Михаил"
Age: от 24 до 52
Salary: от 23000 руб до 33000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 6 лет*/