package org.example.newtest.Response;

public class Response188 {
    public static boolean test188(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 22 && age <= 32
                && salary >= 22000 && salary <= 43000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 22 до 32
Salary: от 22000 руб до 43000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 13 лет*/