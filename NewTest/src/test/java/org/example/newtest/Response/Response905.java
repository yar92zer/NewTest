package org.example.newtest.Response;

public class Response905 {
    public static boolean tets905(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталия")
                && age >= 58 && age <= 59
                && salary >= 26000 && salary <= 49000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 15;
    }
}
/*Name: "Наталья"
Age: от 58 до 59
Salary: от 26000 руб до 49000 руб
Country: "Италия"
Gender: "Женский"
Experience: 15 лет*/