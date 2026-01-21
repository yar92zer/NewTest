package org.example.newtest.Response;

public class Response714 {
    public static boolean test714(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Сергей")
                && age >= 20 && age <= 23
                && salary >= 51000 && salary <= 53000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5;
    }
}
/*Name: "Сергей"
Age: от 20 до 23
Salary: от 51000 руб до 53000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 5 лет*/