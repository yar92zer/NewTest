package org.example.newtest.Response;

public class Response165 {
    public static boolean test165(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 22 && age <= 35
                && salary >= 20000 && salary <= 34000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 22 до 35
Salary: от 20000 руб до 34000 руб
Country: "Франция"
Gender: "Женский"
Experience: 12 лет*/