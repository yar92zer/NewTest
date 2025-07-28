package org.example.newtest.Response;

public class Response71 {
    public static boolean test71(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 21 && age <= 35
                && salary >= 29000 && salary <= 31000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 21 до 35
Salary: от 29000 руб до 31000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 1 год*/