package org.example.newtest.Response;

public class Response809 {
    public static boolean test809(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 32 && age <= 33
                && salary >= 37000 && salary <= 43000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11;
    }
}
/*Name: "Егор"
Age: от 32 до 33
Salary: от 37000 руб до 43000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 11 лет*/