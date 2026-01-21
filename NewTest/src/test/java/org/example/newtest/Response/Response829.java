package org.example.newtest.Response;

public class Response829 {
    public static boolean test829(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 45 && age <= 50
                && salary >= 32000 && salary <= 33000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13;
    }
}
/*Name: "Максим"
Age: от 45 до 50
Salary: от 32000 руб до 33000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 13 лет*/