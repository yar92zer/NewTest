package org.example.newtest.Response;

public class Response757 {
    public static boolean test757(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Анна")
                && age >= 28 && age <= 38
                && salary >= 49000 && salary <= 50000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4;
    }
}
/*Name: "Анна"
Age: от 28 до 38
Salary: от 49000 руб до 50000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 4 года*/