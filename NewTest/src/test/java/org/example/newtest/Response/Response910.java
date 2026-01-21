package org.example.newtest.Response;

public class Response910 {
    public static boolean test910(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 32 && age <= 36
                && salary >= 32000 && salary <= 39000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 14;
    }
}
/*Name: "Елизавета"
Age: от 32 до 36
Salary: от 32000 руб до 39000 руб
Country: "Франция"
Gender: "Женский"
Experience: 14 лет*/