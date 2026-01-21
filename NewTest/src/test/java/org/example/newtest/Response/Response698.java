package org.example.newtest.Response;

public class Response698 {
    public static boolean test698(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 25 && age <= 28
                && salary >= 26000 && salary <= 27000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Оксана"
Age: от 25 до 28
Salary: от 26000 руб до 27000 руб
Country: "Франция"
Gender: "Женский"
Experience: 1 год*/