package org.example.newtest.Response;

public class Response82 {
    public static boolean test82(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 20 && age <= 22
                && salary >= 31000 && salary <= 36000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 20 до 22
Salary: от 31000 руб до 36000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 1 год*/