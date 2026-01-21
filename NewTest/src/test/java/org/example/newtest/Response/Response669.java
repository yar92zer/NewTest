package org.example.newtest.Response;

public class Response669 {
    public static boolean test669(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Сергей")
                && age >= 20 && age <= 50
                && salary >= 38000 && salary <= 48000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10;
    }
}
/*Name: "Сергей"
Age: от 20 до 50
Salary: от 38000 руб до 48000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 10 лет*/