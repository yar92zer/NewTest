package org.example.newtest.Response;

public class Response842 {
    public static boolean test842(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Юлия")
                && age >= 50 && age <= 61
                && salary >= 57000 && salary <= 64000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6;
    }
}
/*Name: "Юлия"
Age: от 50 до 61
Salary: от 57000 руб до 64000 руб
Country: "Италия"
Gender: "Женский"
Experience: 6 лет*/