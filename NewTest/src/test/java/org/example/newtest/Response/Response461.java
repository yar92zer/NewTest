package org.example.newtest.Response;

public class Response461 {
    public static boolean test461(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 21 && age <= 27
                && salary >= 32000 && salary <= 57000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 21 до 27
Salary: от 32000 руб до 57000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 5 лет*/