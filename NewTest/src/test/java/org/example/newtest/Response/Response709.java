package org.example.newtest.Response;

public class Response709 {
    public static boolean test709(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Виктория")
                && age >= 35 && age <= 36
                && salary >= 27000 && salary <= 33000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4;
    }
}
/*Name: "Виктория"
Age: от 35 до 36
Salary: от 27000 руб до 33000 руб
Country: "Франция"
Gender: "Женский"
Experience: 4 года*/