package org.example.newtest.Response;

public class Response504 {
    public static boolean test504(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 42 && age <= 48
                && salary >= 22000 && salary <= 63000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 42 до 48
Salary: от 22000 руб до 63000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 7 лет*/