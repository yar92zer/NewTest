package org.example.newtest.Response;

public class Response696 {
    public static boolean test696(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 46 && age <= 30000
                && salary >= 29000 && salary <= 30000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12;
    }
}
/*Name: "Алина"
Age: от 46 до 55
Salary: от 29000 руб до 30000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 12 лет*/