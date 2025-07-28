package org.example.newtest.Response;

public class Response413 {
    public static boolean test413(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 48 && age <= 50
                && salary >= 21000 && salary <= 65000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 48 до 50
Salary: от 21000 руб до 65000 руб
Country: "Франция"
Gender: "Женский"
Experience: 3 года*/