package org.example.newtest.Response;

public class Response101 {
    public static boolean test101(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 19 && age <= 23
                && salary >= 28000 && salary <= 29000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 19 до 23
Salary: от 28000 руб до 29000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 1 год*/