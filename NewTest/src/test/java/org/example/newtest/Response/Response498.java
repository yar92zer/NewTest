package org.example.newtest.Response;

public class Response498 {
    public static boolean test498(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 20 && age <= 23
                && salary >= 48000 && salary <= 52000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 20 до 23
Salary: от 48000 руб до 52000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 2 года*/