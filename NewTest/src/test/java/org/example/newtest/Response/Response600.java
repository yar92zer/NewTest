package org.example.newtest.Response;

public class Response600 {
    public static boolean test600(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 22 && age <= 31
                && salary >= 29000 && salary <= 32000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 22 до 31
Salary: от 29000 руб до 32000 руб
Country: "Франция"
Gender: "Женский"
Experience: 2 года*/