package org.example.newtest.Response;

public class Response994 {
    public static boolean test994(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 35 && age <= 36
                && salary >= 47000 && salary <= 50000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6;
    }
}
/*Name: "Елизавета"
Age: от 35 до 36
Salary: от 47000 руб до 50000 руб
Country: "Польша"
Gender: "Женский"
Experience: 6 лет*/