package org.example.newtest.Response;

public class Response844 {
    public static boolean test844(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Анна")
                && age >= 30 && age <= 32
                && salary >= 49000 && salary <= 51000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6;
    }
}
/*Name: "Анна"
Age: от 30 до 32
Salary: от 49000 руб до 51000 руб
Country: "Германия"
Gender: "Женский"
Experience: 6 лет*/