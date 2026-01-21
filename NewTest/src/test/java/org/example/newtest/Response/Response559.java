package org.example.newtest.Response;

public class Response559 {
    public static boolean test559(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елизавета")
                && age >= 20 && age <= 23
                && salary >= 29000 && salary <= 30000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Елизавета"
Age: от 20 до 23
Salary: от 29000 руб до 30000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 4 года*/