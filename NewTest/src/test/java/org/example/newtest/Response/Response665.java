package org.example.newtest.Response;

public class Response665 {
    public static boolean test665(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 53 && age <= 54
                && salary >= 27000 && salary <= 32000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6;
    }
}
/*Name: "Елизавета"
Age: от 53 до 54
Salary: от 27000 руб до 32000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 6 лет*/