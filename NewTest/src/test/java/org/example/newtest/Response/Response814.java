package org.example.newtest.Response;

public class Response814 {
    public static boolean test814(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 21 && age <= 28
                && salary >= 59000 && salary <= 62000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2;
    }
}
/*Name: "Михаил"
Age: от 21 до 28
Salary: от 59000 руб до 62000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 2 года*/