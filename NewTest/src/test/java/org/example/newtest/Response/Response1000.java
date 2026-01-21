package org.example.newtest.Response;

public class Response1000 {
    public static boolean test1000(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Анна")
                && age >= 35 && age <= 42
                && salary >= 36000 && salary <= 37000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3;
    }
}
/*Name: "Анна"
Age: от 35 до 42
Salary: от 36000 руб до 37000 руб
Country: "Франция"
Gender: "Женский"
Experience: 3 года*/