package org.example.newtest.Response;

public class Response584 {
    public static boolean test584(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 22 && age <= 23
                && salary >= 28000 && salary <= 30000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 22 до 23
Salary: от 28000 руб до 30000 руб
Country: "Франция"
Gender: "Женский"
Experience: 2 года*/