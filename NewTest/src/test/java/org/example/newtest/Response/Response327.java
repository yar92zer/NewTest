package org.example.newtest.Response;

public class Response327 {
    public static boolean test327(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 24 && age <= 26
                && salary >= 35000 && salary <= 36000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 24 до 26
Salary: от 35000 руб до 36000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 5 лет*/