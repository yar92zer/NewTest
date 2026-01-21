package org.example.newtest.Response;

public class Response942 {
    public static boolean test942(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 27 && age <= 29
                && salary >= 34000 && salary <= 41000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*Name: "Алина"
Age: от 27 до 29
Salary: от 34000 руб до 41000 руб
Country: "Польша"
Gender: "Женский"
Experience: 2 года*/