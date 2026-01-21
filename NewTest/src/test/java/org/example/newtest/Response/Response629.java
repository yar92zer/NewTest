package org.example.newtest.Response;

public class Response629 {
    public static boolean test629(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 34 && age <= 38
                && salary >= 48000 && salary <= 50000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 34 до 38
Salary: от 48000 руб до 50000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 1 год*/