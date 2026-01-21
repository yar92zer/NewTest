package org.example.newtest.Response;

public class Response816 {
    public static boolean test816(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 29 && age <= 35
                && salary >= 35000 && salary <= 52000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 14;
    }
}
/*Name: "Алина"
Age: от 29 до 35
Salary: от 35000 руб до 52000 руб
Country: "Франция"
Gender: "Женский"
Experience: 14 лет*/