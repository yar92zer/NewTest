package org.example.newtest.Response;

public class Response402 {
    public static boolean test402(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 31 && age <= 64
                && salary >= 56 && salary <= 64
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 31 до 64
Salary: от 56000 руб до 60000 руб
Country: "Германия"
Gender: "Женский"
Experience: 1 год*/