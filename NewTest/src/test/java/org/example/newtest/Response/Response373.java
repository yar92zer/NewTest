package org.example.newtest.Response;

public class Response373 {
    public static boolean test373(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 19 && age <= 32
                && salary >= 48000 && salary <= 49000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 19 до 32
Salary: от 48000 руб до 49000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 6 лет*/