package org.example.newtest.Response;

public class Response715 {
    public static boolean test715(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 34 && age <= 36
                && salary >= 36000 && salary <= 42000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10;
    }
}
/*Name: "Максим"
Age: от 34 до 36
Salary: от 36000 руб до 42000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 10 лет*/