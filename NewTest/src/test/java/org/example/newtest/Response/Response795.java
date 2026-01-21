package org.example.newtest.Response;

public class Response795 {
    public static boolean test795(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Мария")
                && age >= 45 && age <= 54
                && salary >= 20000 && salary <= 33000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10;
    }
}
/*Name: "Мария"
Age: от 45 до 54
Salary: от 28000 руб до 33000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 10 лет*/