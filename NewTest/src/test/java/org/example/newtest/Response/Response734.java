package org.example.newtest.Response;

public class Response734 {
    public static boolean test734(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 26 && age <= 38
                && salary >= 46000 && salary <= 58000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8;
    }
}
/*Name: "Елизавета"
Age: от 26 до 38
Salary: от 46000 руб до 58000 руб
Country: "Франция"
Gender: "Женский"
Experience: 8 лет*/