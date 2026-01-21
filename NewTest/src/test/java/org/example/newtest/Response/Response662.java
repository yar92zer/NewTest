package org.example.newtest.Response;

public class Response662 {
    public static boolean test662(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 23 && age <= 31
                && salary >= 27000 && salary <= 36000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Алина"
Age: от 23 до 31
Salary: от 27000 руб до 36000 руб
Country: "Польша"
Gender: "Женский"
Experience: 1 год*/