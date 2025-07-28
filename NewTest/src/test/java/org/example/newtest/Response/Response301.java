package org.example.newtest.Response;

public class Response301 {
    public static boolean test301(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 25 && age <= 28
                && salary >= 33000 && salary <= 34000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 25 до 28
Salary: от 33000 руб до 34000 руб
Country: "Италия"
Gender: "Женский"
Experience: 10 лет*/