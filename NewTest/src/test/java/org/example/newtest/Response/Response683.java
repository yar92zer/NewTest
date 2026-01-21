package org.example.newtest.Response;

public class Response683 {
    public static boolean test683(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 29 && age <= 35
                && salary >= 28000 && salary <= 44000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7;
    }
}
/*Name: "Алина"
Age: от 29 до 35
Salary: от 28000 руб до 44000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 7 лет*/