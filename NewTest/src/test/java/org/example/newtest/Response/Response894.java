package org.example.newtest.Response;

public class Response894 {
    public static boolean test894(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Анна")
                && age >= 29 && age <= 33
                && salary >= 32000 && salary <= 38000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10;
    }
}
/*Name: "Анна"
Age: от 29 до 33
Salary: от 32000 руб до 38000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 10 лет*/