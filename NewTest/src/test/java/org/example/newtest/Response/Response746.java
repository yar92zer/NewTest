package org.example.newtest.Response;

public class Response746 {
    public static boolean test746(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталья")
                && age >= 18 && age <= 21
                && salary >= 31000 && salary <= 35000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Наталья"
Age: от 18 до 21
Salary: от 31000 руб до 35000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 1 год*/