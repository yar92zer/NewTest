package org.example.newtest.Response;

public class Response493 {
    public static boolean test493(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 29 && age <= 30
                && salary >= 34000 && salary <= 37000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 29 до 30
Salary: от 34000 руб до 37000 руб
Country: "Италия"
Gender: "Женский"
Experience: 6 лет*/