package org.example.newtest.Response;

public class Response617 {
    public static boolean test617(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 21 && age <= 22
                && salary >= 27000 && salary <= 29000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 21 до 22
Salary: от 27000 руб до 29000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 2 года*/