package org.example.newtest.Response;

public class Response547 {
    public static boolean test547(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 20 && age <= 25
                && salary >= 25000 && salary <= 33000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 20 до 25
Salary: от 25000 руб до 33000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 5 лет*/