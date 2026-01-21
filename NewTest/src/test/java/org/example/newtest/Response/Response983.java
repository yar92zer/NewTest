package org.example.newtest.Response;

public class Response983 {
    public static boolean test983(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 32 && age <= 63
                && salary >= 23000 && salary <= 41000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12;
    }
}
/*Name: "Оксана"
Age: от 32 до 63
Salary: от 23000 руб до 41000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 12 лет*/