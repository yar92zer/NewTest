package org.example.newtest.Response;

public class Response724 {
    public static boolean test724(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталья")
                && age >= 24 && age <= 43
                && salary >= 27000 && salary <= 40000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12;
    }
}
/*Name: "Наталья"
Age: от 24 до 43
Salary: от 27000 руб до 40000 руб
Country: "Италия"
Gender: "Женский"
Experience: 12 лет*/