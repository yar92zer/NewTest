package org.example.newtest.Response;

public class Response730 {
    public static boolean test730(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Виктор")
                && age >= 25 && age <= 62
                && salary >= 30000 && salary <= 36000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8;
    }
}
/*Name: "Виктория"
Age: от 25 до 62
Salary: от 30000 руб до 36000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 8 лет*/