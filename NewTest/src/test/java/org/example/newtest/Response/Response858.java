package org.example.newtest.Response;

public class Response858 {
    public static boolean test858(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталия")
                && age >= 19 && age <= 22
                && salary >= 50000 && salary <= 55000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Наталья"
Age: от 19 до 22
Salary: от 50000 руб до 55000 руб
Country: "Польша"
Gender: "Женский"
Experience: 1 год*/