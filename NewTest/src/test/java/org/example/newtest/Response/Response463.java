package org.example.newtest.Response;

public class Response463 {
    public static boolean test463(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 37 && age <= 51
                && salary >= 21000 && salary <= 30000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 37 до 51
Salary: от 21000 руб до 30000 руб
Country: "Франция"
Gender: "Женский"
Experience: 1 год*/