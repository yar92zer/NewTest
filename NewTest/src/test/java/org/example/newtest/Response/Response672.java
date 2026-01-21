package org.example.newtest.Response;

public class Response672 {
    public static boolean test672(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталия")
                && age >= 23 && age <= 27
                && salary >= 45000 && salary <= 48000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3;
    }
}
/*Name: "Наталья"
Age: от 23 до 27
Salary: от 45000 руб до 48000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 3 года*/