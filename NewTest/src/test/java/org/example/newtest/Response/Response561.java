package org.example.newtest.Response;

public class Response561 {
    public static boolean test561(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 38 && age <= 42
                && salary >= 36000 && salary <= 38000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 38 до 42
Salary: от 36000 руб до 38000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 11 лет*/