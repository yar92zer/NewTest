package org.example.newtest.Response;

public class Response987 {
    public static boolean test987(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 30 && age <= 50
                && salary >= 38000 && salary <= 39000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10;
    }
}
/*Name: "Егор"
Age: от 30 до 50
Salary: от 38000 руб до 39000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 10 лет*/