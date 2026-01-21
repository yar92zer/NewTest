package org.example.newtest.Response;

public class Response599 {
    public static boolean test599(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 25 && age <= 34
                && salary >= 40000 && salary <= 42000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 25 до 34
Salary: от 40000 руб до 42000 руб
Country: "Италия"
Gender: "Женский"
Experience: 5 лет*/