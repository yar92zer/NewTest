package org.example.newtest.Response;

public class Response668 {
    public static boolean test668(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 31 && age <= 32
                && salary >= 25000 && salary <= 36000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12;
    }
}
/*Name: "Оксана"
Age: от 31 до 32
Salary: от 25000 руб до 36000 руб
Country: "Италия"
Gender: "Женский"
Experience: 12 лет*/