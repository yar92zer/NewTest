package org.example.newtest.Response;

public class Response543 {
    public static boolean test543(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 21 && age <= 26
                && salary >= 55000 && salary <= 64000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 21 до 26
Salary: от 55000 руб до 64000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 6 лет*/