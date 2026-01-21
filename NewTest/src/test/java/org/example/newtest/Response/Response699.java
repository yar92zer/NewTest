package org.example.newtest.Response;

public class Response699 {
    public static boolean test699(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Андрей")
                && age >= 29 && age <= 31
                && salary >= 57000 && salary <= 58000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8;
    }
}
/*Name: "Андрей"
Age: от 29 до 31
Salary: от 57000 руб до 58000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 8 лет*/