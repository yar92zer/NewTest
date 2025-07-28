package org.example.newtest.Response;

public class Response512 {
    public static boolean test512(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталия")
                && age >= 24 && age <= 32
                && salary >= 23000 && salary <= 47000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 24 до 32
Salary: от 23000 руб до 47000 руб
Country: "Франция"
Gender: "Женский"
Experience: 6 лет*/