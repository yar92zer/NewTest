package org.example.newtest.Response;

public class Response762 {
    public static boolean test762(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Анна")
                && age >= 26 && age <= 28
                && salary >= 42000 && salary <= 43000
                && country.equalsIgnoreCase("Австралия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10;
    }
}
/*Name: "Анна"
Age: от 26 до 28
Salary: от 42000 руб до 43000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 10 лет*/