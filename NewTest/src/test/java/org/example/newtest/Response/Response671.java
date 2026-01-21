package org.example.newtest.Response;

public class Response671 {
    public static boolean test671(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 36 && age <= 40
                && salary >= 34000 && salary <= 48000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5;
    }
}
/*Name: "Оксана"
Age: от 36 до 40
Salary: от 34000 руб до 48000 руб
Country: "Германия"
Gender: "Женский"
Experience: 5 лет*/