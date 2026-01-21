package org.example.newtest.Response;

public class Response988 {
    public static boolean test988(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 40 && age <= 49
                && salary >= 24000 && salary <= 25000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Николай"
Age: от 40 до 49
Salary: от 24000 руб до 25000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 1 год*/