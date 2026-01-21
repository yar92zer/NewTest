package org.example.newtest.Response;

public class Response819 {
    public static boolean test819(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 44 && age <= 49
                && salary >= 36000 && salary <= 49000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12;
    }
}
/*Name: "Егор"
Age: от 44 до 49
Salary: от 36000 руб до 49000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 12 лет*/