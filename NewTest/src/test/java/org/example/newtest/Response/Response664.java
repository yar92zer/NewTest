package org.example.newtest.Response;

public class Response664 {
    public static boolean test664(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Виктор")
                && age >= 42 && age <= 43
                && salary >= 22000 && salary <= 40000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3;
    }
}
/*Name: "Виктория"
Age: от 42 до 43
Salary: от 22000 руб до 40000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 3 года*/