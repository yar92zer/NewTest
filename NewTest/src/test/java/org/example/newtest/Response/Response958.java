package org.example.newtest.Response;

public class Response958 {
    public static boolean test958(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталия")
                && age >= 35 && age <= 37
                && salary >= 56000 && salary <= 57000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6;
    }
}
/*Name: "Наталья"
Age: от 35 до 37
Salary: от 56000 руб до 57000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 6 лет*/