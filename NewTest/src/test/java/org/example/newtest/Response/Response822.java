package org.example.newtest.Response;

public class Response822 {
    public static boolean test822(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 41 && age <= 44
                && salary >= 54000 && salary <= 57000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 11;
    }
}
/*Name: "Алина"
Age: от 41 до 44
Salary: от 54000 руб до 57000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 11 лет*/