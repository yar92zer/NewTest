package org.example.newtest.Response;

public class Response462 {
    public static boolean test462(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 34 && age <= 37
                && salary >= 29000 && salary <= 32000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 34 до 37
Salary: от 29000 руб до 32000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 8 лет*/