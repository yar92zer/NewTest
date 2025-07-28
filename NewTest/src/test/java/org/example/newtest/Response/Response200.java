package org.example.newtest.Response;

public class Response200 {
    public static boolean test200(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 29 && age <= 38
                && salary >= 25000 && salary <= 28000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 29 до 38
Salary: от 25000 руб до 28000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 14 лет*/