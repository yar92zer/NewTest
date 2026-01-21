package org.example.newtest.Response;

public class Response750 {
    public static boolean test750(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 30 && age <= 42
                && salary >= 31000 && salary <= 39000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Елизавета"
Age: от 30 до 42
Salary: от 31000 руб до 39000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 1 год*/