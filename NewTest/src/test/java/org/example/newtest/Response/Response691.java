package org.example.newtest.Response;

public class Response691 {
    public static boolean test691(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Екатерина")
                && age >= 37 && age <= 41
                && salary >= 28000 && salary <= 64000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12;
    }
}
/*Name: "Екатерина"
Age: от 37 до 41
Salary: от 28000 руб до 64000 руб
Country: "Франция"
Gender: "Женский"
Experience: 12 лет*/