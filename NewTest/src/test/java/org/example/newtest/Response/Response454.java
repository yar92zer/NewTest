package org.example.newtest.Response;

public class Response454 {
    public static boolean test454(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 23 && age <= 32
                && salary >= 34000 && salary <= 37000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 23 до 32
Salary: от 34000 руб до 37000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 5 лет*/