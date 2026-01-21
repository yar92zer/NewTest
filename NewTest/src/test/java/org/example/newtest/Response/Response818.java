package org.example.newtest.Response;

public class Response818 {
    public static boolean test818(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 20 && age <= 22
                && salary >= 42000 && salary <= 51000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Михаил"
Age: от 20 до 22
Salary: от 42000 руб до 51000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 1 год*/