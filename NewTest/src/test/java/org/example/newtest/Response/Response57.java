package org.example.newtest.Response;

public class Response57 {
    public static boolean test57(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 19 && age <= 22
                && salary >= 23000 && salary <= 41000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 19 до 22
Salary: от 23000 руб до 41000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 2 года*/