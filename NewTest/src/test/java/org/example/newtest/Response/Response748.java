package org.example.newtest.Response;

public class Response748 {
    public static boolean test748(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 19 && age <= 22
                && salary >= 25000 && salary <= 50000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2;
    }
}
/*Name: "Артем"
Age: от 19 до 22
Salary: от 25000 руб до 50000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 2 года*/