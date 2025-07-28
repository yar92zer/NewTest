package org.example.newtest.Response;

public class Response335 {
    public static boolean test335(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 27 && age <= 30
                && salary >= 27000 && salary <= 29000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 27 до 30
Salary: от 27000 руб до 29000 руб
Country: "Германия"
Gender: "Женский"
Experience: 1 год*/