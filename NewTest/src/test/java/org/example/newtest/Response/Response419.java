package org.example.newtest.Response;

public class Response419 {
    public static boolean test419(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 18 && age <= 27
                && salary >= 42000 && salary <= 50000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 18 до 27
Salary: от 42000 руб до 50000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 8 лет*/