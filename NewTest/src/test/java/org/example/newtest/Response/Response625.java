package org.example.newtest.Response;

public class Response625 {
    public static boolean test625(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 24 && age <= 28
                && salary >= 38000 && salary <= 47000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 24 до 28
Salary: от 38000 руб до 47000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 8 лет*/