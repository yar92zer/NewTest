package org.example.newtest.Response;

public class Response794 {
    public static boolean test794(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 19 && age <= 20
                && salary >= 32000 && salary <= 38000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Максим"
Age: от 19 до 20
Salary: от 32000 руб до 38000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 1 год*/