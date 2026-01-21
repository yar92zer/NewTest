package org.example.newtest.Response;

public class Response835 {
    public static boolean test835(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталья")
                && age >= 24 && age <= 25
                && salary >= 64000 && salary <= 65000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5;
    }
}
/*Name: "Наталья"
Age: от 24 до 25
Salary: от 64000 руб до 65000 руб
Country: "Германия"
Gender: "Женский"
Experience: 5 лет*/