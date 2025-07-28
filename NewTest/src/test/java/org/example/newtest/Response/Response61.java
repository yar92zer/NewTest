package org.example.newtest.Response;

public class Response61 {
    public static boolean test61(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 18 && age <= 19
                && salary >= 25000 && salary <= 35000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 18 до 19
Salary: от 25000 руб до 35000 руб
Country: "Германия"
Gender: "Женский"
Experience: 1 год*/