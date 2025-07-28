package org.example.newtest.Response;

public class Response350 {
    public static boolean test350(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 47 && age <= 50
                && salary >= 30000 && salary <= 36000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 47 до 50
Salary: от 30000 руб до 36000 руб
Country: "Франция"
Gender: "Женский"
Experience: 13 лет*/