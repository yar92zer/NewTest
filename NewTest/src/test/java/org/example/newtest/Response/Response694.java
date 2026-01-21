package org.example.newtest.Response;

public class Response694 {
    public static boolean test694(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 33 && age <= 36
                && salary >= 28000 && salary <= 31000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9;
    }
}
/*Name: "Максим"
Age: от 33 до 36
Salary: от 28000 руб до 31000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 9 лет*/