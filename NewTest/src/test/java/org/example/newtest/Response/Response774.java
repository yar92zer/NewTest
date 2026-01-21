package org.example.newtest.Response;

public class Response774 {
    public static boolean test774(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Виктория")
                && age >= 50 && age <= 53
                && salary >= 20000 && salary <= 32000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13;
    }
}
/*Name: "Виктория"
Age: от 50 до 53
Salary: от 20000 руб до 32000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 13 лет*/