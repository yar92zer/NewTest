package org.example.newtest.Response;

public class Response703 {
    public static boolean test703(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 20 && age <= 24
                && salary >= 64000 && salary <= 66000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6;
    }
}
/*Name: "Оксана"
Age: от 20 до 24
Salary: от 64000 руб до 66000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 6 лет*/