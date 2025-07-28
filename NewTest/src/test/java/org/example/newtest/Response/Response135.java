package org.example.newtest.Response;

public class Response135 {
    public static boolean test135(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 22 && age <= 30
                && salary >= 35000 && salary <= 40000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 22 до 30
Salary: от 35000 руб до 40000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 12 лет*/