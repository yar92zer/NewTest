package org.example.newtest.Response;

public class Response531 {
    public static boolean test531(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 26 && age <= 28
                && salary >= 29000 && salary <= 36000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 26 до 28
Salary: от 29000 руб до 36000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 3 года*/