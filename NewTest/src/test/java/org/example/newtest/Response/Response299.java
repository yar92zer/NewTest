package org.example.newtest.Response;

public class Response299 {
    public static boolean test299(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 23 && age <= 28
                && salary >= 31000 && salary <= 51000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 23 до 28
Salary: от 31000 руб до 51000 руб
Country: "Италия"
Gender: "Женский"
Experience: 8 лет*/