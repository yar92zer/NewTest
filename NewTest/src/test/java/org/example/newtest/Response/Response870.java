package org.example.newtest.Response;

public class Response870 {
    public static boolean test870(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 37 && age <= 40
                && salary >= 36000 && salary <= 37000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 11;
    }
}
/*Name: "Оксана"
Age: от 37 до 40
Salary: от 36000 руб до 37000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 11 лет*/