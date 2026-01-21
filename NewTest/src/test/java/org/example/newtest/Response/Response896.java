package org.example.newtest.Response;

public class Response896 {
    public static boolean test896(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 25 && age <= 35
                && salary >= 43000 && salary <= 55000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13;
    }
}
/*Name: "Елизавета"
Age: от 25 до 35
Salary: от 43000 руб до 55000 руб
Country: "Италия"
Gender: "Женский"
Experience: 13 лет*/