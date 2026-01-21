package org.example.newtest.Response;

public class Response909 {
    public static boolean test909(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Анна")
                && age >= 22 && age <= 24
                && salary >= 44000 && salary <= 45000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5;
    }
}
/*Name: "Анна"
Age: от 22 до 24
Salary: от 44000 руб до 45000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 5 лет*/