package org.example.newtest.Response;

public class Response995 {
    public static boolean test995(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Мария")
                && age >= 24 && age <= 27
                && salary >= 31000 && salary <= 69000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9;
    }
}
/*Name: "Мария"
Age: от 24 до 27
Salary: от 31000 руб до 69000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 9 лет*/