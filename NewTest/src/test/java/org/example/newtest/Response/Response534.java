package org.example.newtest.Response;

public class Response534 {
    public static boolean test534(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 26 && age <= 30
                && salary >= 41000 && salary <= 42000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 26 до 30
Salary: от 41000 руб до 42000 руб
Country: "Франция"
Gender: "Женский"
Experience: 4 года*/