package org.example.newtest.Response;

public class Response490 {
    public static boolean test490(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 49 && age <= 63
                && salary >= 20000 && salary <= 260000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 49 до 63
Salary: от 20000 руб до 26000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 10 лет*/