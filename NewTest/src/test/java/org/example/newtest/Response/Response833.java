package org.example.newtest.Response;

public class Response833 {
    public static boolean test833(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 47 && age <= 61
                && salary >= 24000 && salary <= 41000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8;
    }
}
/*Name: "Елизавета"
Age: от 47 до 61
Salary: от 24000 руб до 41000 руб
Country: "Франция"
Gender: "Женский"
Experience: 8 лет*/