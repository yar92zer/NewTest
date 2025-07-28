package org.example.newtest.Response;

public class Response201 {
    public static boolean test201(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 26 && age <= 49
                && salary >= 29000 && salary <= 34000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 26 до 49
Salary: от 29000 руб до 34000 руб
Country: "Франция"
Gender: "Женский"
Experience: 6 лет*/