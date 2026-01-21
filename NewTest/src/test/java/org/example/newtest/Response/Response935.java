package org.example.newtest.Response;

public class Response935 {
    public static boolean test932(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталья")
                && age >= 36 && age <= 42
                && salary >= 47000 && salary <= 56000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 15;
    }
}
/*Name: "Наталья"
Age: от 36 до 42
Salary: от 47000 руб до 56000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 15 лет*/