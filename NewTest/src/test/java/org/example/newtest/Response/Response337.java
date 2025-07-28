package org.example.newtest.Response;

public class Response337 {
    public static boolean test337(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 34 && age <= 53
                && salary >= 34 && salary <= 53
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женская")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 34 до 53
Salary: от 52000 руб до 65000 руб
Country: "Франция"
Gender: "Женский"
Experience: 8 лет*/