package org.example.newtest.Response;

public class Response115 {
    public static boolean test115(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 24 && age <= 25
                && salary >= 24000 && salary <= 28000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 24 до 25
Salary: от 24000 руб до 28000 руб
Country: "Франция"
Gender: "Женский"
Experience: 7 лет*/