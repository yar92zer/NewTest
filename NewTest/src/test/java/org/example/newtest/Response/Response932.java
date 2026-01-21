package org.example.newtest.Response;

public class Response932 {
    public static boolean test932(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 19 && age <= 31
                && salary >= 25000 && salary <= 27000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 11;
    }
}
/*Name: "Алина"
Age: от 19 до 31
Salary: от 25000 руб до 27000 руб
Country: "Польша"
Gender: "Женский"
Experience: 11 лет*/