package org.example.newtest.Response;

public class Response510 {
    public static boolean test510(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 28 && age <= 30
                && salary >= 31000 && salary <= 47000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 28 до 30
Salary: от 31000 руб до 47000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 1 год*/