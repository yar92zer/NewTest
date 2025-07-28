package org.example.newtest.Response;

public class Response421 {
    public static boolean test421(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 18 && age <= 48
                && salary >= 39000 && salary <= 52000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 18 до 48
Salary: от 39000 руб до 52000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 8 лет*/