package org.example.newtest.Response;

public class Response552 {
    public static boolean test552(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елизавета")
                && age >= 33 && age <= 52
                && salary >= 23000 && salary <= 36000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Елизавета"
Age: от 33 до 52
Salary: от 23000 руб до 36000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 15 лет*/