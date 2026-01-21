package org.example.newtest.Response;

public class Response906 {
    public static boolean test906(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Мария")
                && age >= 34 && age <= 50
                && salary >= 26000 && salary <= 30000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9;
    }
}
/*Name: "Мария"
Age: от 34 до 50
Salary: от 26000 руб до 30000 руб
Country: "Италия"
Gender: "Женский"
Experience: 9 лет*/