package org.example.newtest.Response;

public class Response717 {
    public static boolean test717(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталья")
                && age >= 20 && age <= 38
                && salary >= 55000 && salary <= 64000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9;
    }
}
/*Name: "Наталья"
Age: от 20 до 38
Salary: от 55000 руб до 64000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 9 лет*/