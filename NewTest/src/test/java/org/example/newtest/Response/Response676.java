package org.example.newtest.Response;

public class Response676 {
    public static boolean test676(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 46 && age <= 52
                && salary >= 26000 && salary <= 46000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5;
    }
}
/*Name: "Оксана"
Age: от 46 до 52
Salary: от 26000 руб до 46000 руб
Country: "Франция"
Gender: "Женский"
Experience: 5 лет*/