package org.example.newtest.Response;

public class Response684 {
    public static boolean test684(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Мария")
                && age >= 27 && age <= 32
                && salary >= 32000 && salary <= 38000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 14;
    }
}
/*Name: "Мария"
Age: от 27 до 32
Salary: от 32000 руб до 38000 руб
Country: "Италия"
Gender: "Женский"
Experience: 14 лет*/