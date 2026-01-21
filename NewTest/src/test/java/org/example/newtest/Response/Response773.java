package org.example.newtest.Response;

public class Response773 {
    public static boolean test773(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталья")
                && age >= 29 && age <= 30
                && salary >= 52000 && salary <= 53000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12;
    }
}
/*Name: "Наталья"
Age: от 29 до 30
Salary: от 52000 руб до 53000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 12 лет*/