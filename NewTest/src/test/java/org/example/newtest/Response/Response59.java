package org.example.newtest.Response;

public class Response59 {
    public static boolean test59(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 23 && age <= 45
                && salary >= 37000 && salary <= 42000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 23 до 45
Salary: от 37000 руб до 42000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 15 лет*/