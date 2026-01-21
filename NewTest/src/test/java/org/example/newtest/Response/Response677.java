package org.example.newtest.Response;

public class Response677 {
    public static boolean test677(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Мария")
                && age >= 36 && age <= 62
                && salary >= 21000 && salary <= 57000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 14;
    }
}
/*Name: "Мария"
Age: от 36 до 62
Salary: от 21000 руб до 57000 руб
Country: "Германия"
Gender: "Женский"
Experience: 14 лет*/