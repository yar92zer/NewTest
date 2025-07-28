package org.example.newtest.Response;

public class Response338 {
    public static boolean test338(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 18 && age <= 42
                && salary >= 47000 && salary <= 59000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 18 до 42
Salary: от 47000 руб до 59000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 9 лет*/