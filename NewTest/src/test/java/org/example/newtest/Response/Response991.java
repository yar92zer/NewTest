package org.example.newtest.Response;

public class Response991 {
    public static boolean test991(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 20 && age <= 34
                && salary >= 49000 && salary <= 50000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 15;
    }
}
/*Name: "Оксана"
Age: от 20 до 34
Salary: от 49000 руб до 50000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 15 лет*/