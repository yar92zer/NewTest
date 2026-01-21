package org.example.newtest.Response;

public class Response659 {
    public static boolean test659(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Анна")
                && age >= 27 && age <= 31
                && salary >= 42000 && salary <= 43000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Анна"
Age: от 27 до 31
Salary: от 42000 руб до 43000 руб
Country: "Франция"
Gender: "Женский"
Experience: 1 год*/