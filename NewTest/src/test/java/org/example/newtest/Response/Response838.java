package org.example.newtest.Response;

public class Response838 {
    public static boolean test838(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 18 && age <= 21
                && salary >= 22000 && salary <= 30000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Егор"
Age: от 18 до 21
Salary: от 22000 руб до 30000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 3 года*/