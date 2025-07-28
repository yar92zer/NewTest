package org.example.newtest.Response;

public class Response458 {
    public static boolean test458(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 31 && age <= 32
                && salary >= 42000 && salary <= 52000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 31 до 32
Salary: от 42000 руб до 52000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 11 лет*/