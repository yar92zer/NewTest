package org.example.newtest.Response;

public class Response567 {
    public static boolean test567(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 35 && age <= 50
                && salary >= 27000 && salary <= 40000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 35 до 50
Salary: от 27000 руб до 40000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 7 лет*/