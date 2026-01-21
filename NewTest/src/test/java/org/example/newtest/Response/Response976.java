package org.example.newtest.Response;

public class Response976 {
    public static boolean test976(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Юлия")
                && age >= 34 && age <= 53
                && salary >= 40000 && salary <= 55000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 11;
    }
}
/*Name: "Юлия"
Age: от 34 до 53
Salary: от 40000 руб до 55000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 11 лет*/