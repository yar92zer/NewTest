package org.example.newtest.Response;

public class Response887 {
    public static boolean test887(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталья")
                && age >= 33 && age <= 35
                && salary >= 34000 && salary <= 40000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10;
    }
}
/*Name: "Наталья"
Age: от 33 до 35
Salary: от 34000 руб до 40000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 10 лет*/