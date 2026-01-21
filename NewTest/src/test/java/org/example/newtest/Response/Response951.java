package org.example.newtest.Response;

public class Response951 {
    public static boolean test951(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 58 && age <= 59
                && salary >= 42000 && salary <= 48000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13;
    }
}
/*Name: "Максим"
Age: от 58 до 59
Salary: от 42000 руб до 48000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 13 лет*/